package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFromArray {

	public static void main(String[] args) {
		
		String[] names= {"Erick", "Daniel", "Kathy", "Tavo", "Sebastian", "Karen"};
		
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		
		int key=1;
		
		for(String name:names) {
			nameMap.put(key, name);
			key++;
		}
		
		//System.out.println(nameMap);
		//print key and values using entrySet(loop && Iterator)
		
		
		for(Map.Entry<Integer, String> na:nameMap.entrySet()) {
			System.out.print(na.getKey()+"="+na.getValue()+" ");
		}
		
		
		Iterator <Map.Entry<Integer, String>>it=nameMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			System.out.print(entry.getKey()+" "+entry.getValue());
		}
	}
}
