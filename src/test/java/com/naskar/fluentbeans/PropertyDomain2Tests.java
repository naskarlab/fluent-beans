package com.naskar.fluentbeans;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.naskar.fluentbeans.domain2.Account;
import com.naskar.fluentbeans.domain2.Person;

public class PropertyDomain2Tests {
	
	@Test
	public void testCompleteFluentUsageProperties() {
		// Arrange
		Person customer = new Person();
		Account account = new Account();
		
		// Act
		customer
			.name().set("john");
		
		account
			.customer().<Account>set(customer)
			.credit(100.0)
			.debit(40.0);
		
		// Assert
		assertThat(account.balance().get(), equalTo(60.0));
	}
	
}
