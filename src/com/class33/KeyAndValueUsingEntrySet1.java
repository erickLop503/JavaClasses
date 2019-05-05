package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyAndValueUsingEntrySet1 {

	public static void main(String[] args) {
		
		List<String> aList=new ArrayList<String>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("James");

		Set<String> hSet=new HashSet<String>();
		hSet.addAll(aList);
		System.out.println(hSet);
		
		
	}
}
