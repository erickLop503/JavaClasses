package com.class33;

import java.util.*;
public class Task {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Amazon");
		map.put(4, "Fc Barcelona");
		map.put(5, "Google");
		map.put(6, "Syntax");
		map.put(7, "Ebay");

		System.out.println(map);
		map.replace(4,"Best buy");
		System.out.println(map);
		map.remove(7);
		System.out.println(map);
		
		
	}
}
