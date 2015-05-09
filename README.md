# fluent-beans

Fluent Beans is a small library for java that you can create fluent java beans.

```

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

```
