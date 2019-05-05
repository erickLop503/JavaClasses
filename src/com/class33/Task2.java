package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {

		// Create a map of Best Buy store. Place
		// item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		// Print all keys and values from a Best Buy map using EntrySet.

		Map<Integer, String> item = new LinkedHashMap<>();
		item.put(7210, "Mouse");
		item.put(7211, "Keyboard");
		item.put(7212, "Screen Monitor");
		item.put(7213, "Laptop");
		item.put(7214, "PC");

		// System.out.println(item);
		for (Map.Entry<Integer, String> entry : item.entrySet()) {
			System.out.println(entry);
		}

		System.out.println("------------------------------------");
		Iterator<Map.Entry<Integer, String>> classIterator = item.entrySet().iterator();
		while (classIterator.hasNext()) {
			Map.Entry<Integer, String> items = classIterator.next();
			System.out.println(items.getKey() + " " + items.getValue());
		}
	}
}
