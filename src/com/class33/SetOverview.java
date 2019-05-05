package com.class33;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
		
		Set<String> classDay=new TreeSet<>();
		classDay.add("Tuesday");
		classDay.add("Wednesday");
		classDay.add("Thursday");
		classDay.add("Saturday");
		classDay.add("Sunday");

		System.out.println(classDay);
		System.out.println("---------------");
		
		for (String day:classDay) {
			System.out.println(day);
		}
		
		System.out.println("---------------");
		
		Iterator<String> it=classDay.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
