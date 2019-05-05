package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {

	// create a map of grocery products and it is quantity

	public static void main(String[] args) {

		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread", 2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Potatoes", 2);
		groceryMap.put("Cookies", 3);

		System.out.println(groceryMap);
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap.size());

		groceryMap.replace("Eggs", 18);
		System.out.println(groceryMap);

		groceryMap.remove("Cheese");
		System.out.println(groceryMap);

		// retrieving all keys+values using keySet(); in 2 lines
		Set<String> keySet = groceryMap.keySet();
		for (String key : keySet) {
			System.out.println("Key is " + key + " and value is " + groceryMap.get(key));
		}

		// retrieving all keys+values using keySet(); in 1 lines
		System.out.println("-----------------------------------------------------");
		for (String key : groceryMap.keySet()) {
			System.out.println("Key is " + key + " and value is " + groceryMap.get(key));

		}

		Iterator<String> keyIt = keySet.iterator();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			System.out.println(key + ":" + groceryMap.get(key));
		}

		System.out.println("------------------------------------");
		Iterator<String> keyIt1 = groceryMap.keySet().iterator();
		while (keyIt1.hasNext()) {
			String key = keyIt1.next();
			System.out.println(key + ":" + groceryMap.get(key));
		}

		System.out.println("-------------------------------------");
		// retrieving all values using;
//		Collection<Integer> valCollection=groceryMap.values();
//		for(Integer value:valCollection) {
//			System.out.println(value);
//		}
		for (Integer value : groceryMap.values()) {
			System.out.println(value);
		}

		System.out.println("--------------------------------------");
		Iterator<Integer> valueIt = groceryMap.values().iterator();
		while (valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}

		// retrieving all keys+values using entrySet();

		for (Map.Entry<String, Integer> entry : groceryMap.entrySet()) {
			String mapValue = entry.getKey() + "==" + entry.getValue();
			System.out.println(mapValue);
		}

		// map --> using entrySet() --> Set --> any collection has iterator method-->
		// Iterator
		Iterator<Map.Entry<String, Integer>> it = groceryMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			String valueFromMap = entry.getKey() + " and value is " + entry.getValue();
			System.out.println(valueFromMap);
		}
	}
}
