# fluent-beans

Fluent Beans is a small library for java that you can create fluent java beans.

## Features

- Standard get/set properties in java;
- Easy binding between domain classes;


## Examples

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

Domain Classes:


```

public class Person {
	
	private final Property<String> name = new Property<String>();

	public Property<String> name() {
		return name;
	}

}

```


```
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

```


You too can to create easily binding classes between the UI model classes and domain or value objects due the Property class:

```

/**
 * A simple reference to a value.
 *  
 * @param <T> type of the value.
 */
public interface Value<T> {
	
	/**
	 * Gets the value.
	 * 
	 * @return the current value.
	 */
	T get();
}

```

```

/**
 * A value that can be changed.
 *  
 * @param <T> type of value.
 */
interface MutableValue<T> extends Value<T> {
	
	/**
	 * Sets the value.
	 * 
	 * @param value a new value
	 * @return the enclosing instance, if any, otherwise null.
	 */
	<E> E set(T value);
}

```

```

public final class Property<T> implements MutableValue<T> {

	...

}
 
```

 