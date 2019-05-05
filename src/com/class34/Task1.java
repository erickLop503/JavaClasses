package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {

		Map<String, Integer> salaryMap=new HashMap<>();
		salaryMap.put("Erick Lopez", 120000);
		salaryMap.put("Kathy Lopez", 110000);
		salaryMap.put("Billy Lopez", 130000);
		salaryMap.put("Tavo Moran",   50000);
		salaryMap.put("Danny Perez", 100000);
		
		int maxSalary=0;
		String key=null;
		
		for(Map.Entry<String, Integer> entry:salaryMap.entrySet()) {
			if(entry.getValue()>maxSalary) {
				maxSalary=entry.getValue();
				key=entry.getKey();
			}
		}
		
		System.out.println(maxSalary+" Belongs to "+key);
		
	}
}
