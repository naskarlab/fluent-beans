package com.naskar.fluentbeans;

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
