package com.class15;

public class Main {

	/*
	 * Create a class named 'Main' with String variable 'name' and integer variable
	 * 'roll_no'.
	 * 
	 * Creating an object of the class Main and assign value of 2 to roll_no and
	 * name as "John"
	 * 
	 * Your program should print the following: Name is John and roll number is 2
	 */
	
	String name;
	int roll_no;
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		obj.name="John";
		obj.roll_no=2;
		
		System.out.println("Name is " +obj.name+ " and roll number is " +obj.roll_no);
	}
	
}
