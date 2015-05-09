package com.naskar.fluentbeans;

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
