package com.naskar.fluentbeans.domain2;

import com.naskar.fluentbeans.Property;
import com.naskar.fluentbeans.Value;

public class Account {
	
	private final Property<Double> balance = new Property<Double>(0.0, this);
	private final Property<Person> customer = new Property<Person>(new Person(), this);

	public Value<Double> balance() {
		return balance.value();
	}
	
	public Property<Person> customer() {
		return customer;
	}

	public Account credit(double value) {
		// TODO: business rules
		return this.balance.<Account>set(this.balance.get() + value);
		
	}
	
	public Account debit(double value) {
		// TODO: business rules 
		return this.balance.<Account>set(this.balance.get() - value);
	}

}
