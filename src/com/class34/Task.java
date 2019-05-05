package com.class34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {
	public static void main(String[] args) {

		/*
		 * 1.Create a Map from array of cities that will sort keys in alphabetical
		 * order. As a key store the name of the city and as a value store the length of
		 * the city name (Example: Paris=5, Moscow =6 etc..). If any city name is more
		 * than 7 characters remove that city ( use entrySet with Iterator ).
		 * 
		 * 2. Write a program to check which employee gets highest salary use hashmap
		 * employee name as key and salary amount as the value. Output example: John
		 * Smith=100000.
		 */

		String[] cityArray = { "San Salvador", "Tegusigalpa", "DC", "MDF" };

		Map<String, Integer> citiesMap = new TreeMap<>();
		citiesMap.put("San Salvador", 12);
		citiesMap.put("Tegusigalpa", 11);
		citiesMap.put("DC", 2);
		citiesMap.put("MDF", 3);

		for (String city : cityArray) {
			citiesMap.put(city, city.length());
		}
		System.out.println(citiesMap);

		Iterator<Map.Entry<String, Integer>> it = citiesMap.entrySet().iterator();
		while (it.hasNext()) {
//			if(it.next().getValue()>7) {
//				it.remove();
//			}
//		int num=it.next().getValue();
//		if (num>7) {
//			it.remove();
//		}
			String key = it.next().getKey();
			if (key.length() > 7) {
				it.remove();
			}

		}

		System.out.println(citiesMap);

	}
}
