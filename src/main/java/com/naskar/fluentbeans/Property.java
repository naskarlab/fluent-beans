package com.naskar.fluentbeans;

/**
 * A property.
 * 
 * Enclosing is a instance for enclosing class that
 * have the property. The set method returns this 
 * instance.
 * 
 * @param <T> type of property.
 */
public final class Property<T> implements MutableValue<T> {
	
	private T value;
	private Object enclosing;
	
	public Property() {
	}
	
	public Property(T value) {
		this.value = value;
	}
	
	public Property(T value, Object enclosing) {
		this.value = value;
		this.enclosing = enclosing;
	}

	@Override
	public T get() {
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> E set(T value) {
		this.value = value;
		return (E)this.enclosing;
	}
	
	/**
	 * A read-only access to value.
	 * @return value.
	 */
	public Value<T> value() {
		return new ReadOnlyValue<T>(value); 
	}
	
	@Override
	public String toString() {
		return value != null ? value.toString() : "null";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof Property)) {
			return false;
		}
		
		Property<?> other = (Property<?>) obj;
		if (value == null) {
			if (other.value != null) {
				return false;
			}
			
		} else if (!value.equals(other.value)) {
			return false;
		}
		
		return true;
	}

}
