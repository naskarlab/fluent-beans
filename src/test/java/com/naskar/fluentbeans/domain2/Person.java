package com.naskar.fluentbeans.domain2;

import com.naskar.fluentbeans.Property;

public class Person {
	
	private final Property<String> name = new Property<String>();

	public Property<String> name() {
		return name;
	}

}
