package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySet {

	public static void main(String[] args) {
		
		Map<String, Integer> classRoomMap=new LinkedHashMap<>();
		classRoomMap.put("Table", 20);//Entry<key, Value>
		classRoomMap.put("Chair", 60);//Entry<String, Integer>
		classRoomMap.put("Screen", 3);
		classRoomMap.put("Students", 60);
		classRoomMap.put("Instructor", 3);

		System.out.println(classRoomMap);
		for(Map.Entry <String, Integer> entry:classRoomMap.entrySet()) {
			System.out.println(entry.getKey()+ "=" +entry.getValue());
		}
		
		System.out.println("----------------------------------");
		Iterator <Map.Entry<String, Integer>> classIterator=classRoomMap.entrySet().iterator();
		while (classIterator.hasNext()) {
			Map.Entry<String, Integer> me=classIterator.next();
			System.out.println(me.getKey()+ "=" +me.getValue());
		}
	}
}
