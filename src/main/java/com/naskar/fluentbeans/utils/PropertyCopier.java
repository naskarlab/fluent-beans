package com.naskar.fluentbeans.utils;

import java.util.HashMap;
import java.util.Map;

import com.naskar.fluentbeans.MutableValue;
import com.naskar.fluentbeans.Value;

/**
 * Copies some properties from instance to other instance class.
 * 
 * You can to add properties and after copy.
 */
public class PropertyCopier {
	
	private Map<Value<Object>, MutableValue<Object>> props = 
		new HashMap<Value<Object>, MutableValue<Object>>();
	
	@SuppressWarnings("unchecked")
	public <T> PropertyCopier add(Value<T> from, MutableValue<T> to) {
		this.props.put((Value<Object>)from, (MutableValue<Object>)to);
		return this;
	}
	
	public void copy() {
		for(Map.Entry<Value<Object>, MutableValue<Object>> entry : this.props.entrySet()) {
			entry.getValue().set(entry.getKey().get());
		}
		
	}

}
