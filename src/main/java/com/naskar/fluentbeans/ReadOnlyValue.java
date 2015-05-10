package com.naskar.fluentbeans;

/**
 * Limits the access to a value to read only.
 *
 * @param <T> type of the value
 */
public final class ReadOnlyValue<T> implements Value<T> {
	
	private final T value;
	
	public ReadOnlyValue(T value) {
		this.value = value;
	}

	@Override
	public T get() {
		return value;
	}

}
