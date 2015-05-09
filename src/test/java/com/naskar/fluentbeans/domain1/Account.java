package com.naskar.fluentbeans.domain1;

import com.naskar.fluentbeans.Property;
import com.naskar.fluentbeans.Value;

public class Account {
	
	private final Property<Double> balance = new Property<Double>(0.0);
	private final Property<Person> customer = new Property<Person>(new Person());

	public Value<Double> balance() {
		return balance.value();
	}
	
	public Property<Person> customer() {
		return customer;
	}

	public void credit(double value) {
		// TODO: business rules
		this.balance.set(this.balance.get() + value);
	}
	
	public void debit(double value) {
		// TODO: business rules 
		this.balance.set(this.balance.get() - value);
	}

}
