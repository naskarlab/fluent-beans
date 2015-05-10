package com.naskar.fluentbeans;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import com.naskar.fluentbeans.domain1.Person;
import com.naskar.fluentbeans.utils.PropertyCopier;

public class PropertyCopierTests {
	
	@Test
	public void testSimpleCopy() {
		// Arrange
		Person onePerson = new Person();
		onePerson.name().set("steve");
		
		Person otherPerson = new Person();
		
		PropertyCopier copier = new PropertyCopier();
		copier.add(onePerson.name(), otherPerson.name());
		
		// Act
		copier.copy();
				
		// Assert
		assertThat(onePerson.name(), equalTo(otherPerson.name()));
	}
	
}
