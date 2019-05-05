package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class KeyAndValueUsingEntrySet {

	public static void main(String[] args) {
		
		Map<String, String> userDatailsMap=new LinkedHashMap<>();
		userDatailsMap.put("Name", "Erick Lopez");//1 entry
		userDatailsMap.put("Salary", "90000");//2 entry
		userDatailsMap.put("Department", "IT");
		userDatailsMap.put("Title", "Automation Tester");

		System.out.println(userDatailsMap);
		userDatailsMap.entrySet();//returns a set of entries
		
		for (Map.Entry <String, String> entry: userDatailsMap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("Using iterator--------------");
		Iterator <Map.Entry<String, String>>it=userDatailsMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
