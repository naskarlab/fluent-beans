package com.naskar.fluentbeans;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import com.naskar.fluentbeans.domain1.Account;
import com.naskar.fluentbeans.domain1.Person;

public class PropertyDomain1Tests {
	
	@Test
	public void testSimpleUsageProperties() {
		// Arrange
		Person customer = new Person();
		Account account = new Account();
		
		// Act
		customer.name().set("john");
		
		account.customer().set(customer);
		account.credit(100.0);
		account.debit(40.0);
		
		// Assert
		assertThat(account.balance().get(), equalTo(60.0));
	}
	
}
