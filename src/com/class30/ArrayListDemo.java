package com.class30;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> greetings= new ArrayList<String>();
		
		//to add values to array we use add method 
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Hi");
		greetings.add("Bye");
		
		System.out.println(greetings.get(1));
		
		//to find the size of arraylist
		System.out.println(greetings.size());//4
	
		//collections - growable in size
		System.out.println(greetings.add("How are you?"));
		System.out.println(greetings.add("How are you?"));
		System.out.println(greetings.add("How are you?"));

		System.out.println(greetings.size());
	    
	
		System.out.println("---for loop---");
		// one method
		for (int i=0; i<greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		
		
		System.out.println("---Advance loop---");
		for (String greetWords: greetings) {
			System.out.println(greetWords);
		}
	}
}
