package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {

	public static void main(String[] args) {
		
		Map<Integer , Person> personMap=new HashMap<>();
		personMap.put(1, new Person("Erick","Lopez",31,60000));
		personMap.put(2, new Person("Kathy","Lopez",23,80000));
		personMap.put(3, new Person("Emily","Lopez",13,30000));

		Collection<Person> personValues=personMap.values();
	    for(Person person:personValues) {
	    	person.personDatails();
	    }
	
	}
	

}
