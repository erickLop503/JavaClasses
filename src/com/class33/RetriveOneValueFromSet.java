package com.class33;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveOneValueFromSet {

	public static void main(String[] args) {
		
		Set<String> cars=new LinkedHashSet<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Ford");

		//1 way we convert to ArrayList
		// a - add collection into ArrayList
		List<String> list=new ArrayList<>(cars);
		System.out.println("List collection is: "+list);
		System.out.println(list.get(2));
		
		//b -
		List <String> list2=new ArrayList<>();
		list2.addAll(cars);
		System.out.println("List 2 collection is: "+list2);
		
		//2 way we can converted into array
		Object[] array=cars.toArray();
		System.out.println(array[1]);
	}
}
