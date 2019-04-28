package com.class30;

import java.util.ArrayList;

public class Task {

	/*
	 * Create a generic ArrayList that will
	 * store 5 names into it. Find out whether the given ArrayList is empty or not?
	 * Check whether the specific name is present in an ArrayList or not? Find the
	 * size of your arrayList and print all values from that
	 */
	
	public static void main(String[] args) {
		
		//generic that store only string Objects
	 ArrayList<String> name=new ArrayList<String>();
	 name.add("Erick");
	 name.add("Daniel");
	 name.add("Dan");
	 name.add("Kathy");
	 name.add("Karen");
	 
	 System.out.println(name.contains("Danny"));
	 System.out.println(name.isEmpty());
	 System.out.println(name.size());
	 
	 for (int i=0; i<name.size(); i++) {
		 System.out.println(name.get(i));
	 }
	 
	 //non generic arrayList- we can store different types of objects
	 ArrayList alist=new ArrayList();
	 
	 alist.add("String");
	 alist.add(100);
	 alist.add(100.10);
	 alist.add(true);
	 alist.add('a');
	 
	 for (Object values:alist) {
		 System.out.println(values);
	 }
	 
	 ArrayList<Boolean> booleanArrayList=new ArrayList();
	 booleanArrayList.add(true);
	 booleanArrayList.add(false);
	 
	 for (Object val : booleanArrayList) {
		 System.out.println(val);
	 }
	}
}
