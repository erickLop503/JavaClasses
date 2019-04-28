package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		 name.add("Erick");
		 name.add("Daniel");
		 name.add("Dan");
		 name.add("Kathy");
		 name.add("Karen");
		 
		 //1 way using for loop
		 System.out.println("--------------------");
		 for (int i=0; i<name.size(); i++) {
			 System.out.println(name.get(i));
		 }
		 
		 //2 way using advance loop
         System.out.println("----------------------");
		 for (Object val:name) {
			 System.out.println(val);
		 }
		 
		 //3 way using iterator
		 System.out.println("--------------------");
		Iterator<String> it= name.iterator();
		//boolean check=it.hasNext();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
