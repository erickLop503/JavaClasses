package com.class22;

public class Task {

	/*
	 * Write a program that will have a constructor: one with parameters and second
	 * without any parameters. Create a separate Test class where you will execute
	 * both of the constructors.
	 * 
	 * Write a java program of Class Students that takes students name and 3 subject
	 * grades. Inside your class also have a method to Calculate Average Grade. Test
	 * Student class for 5 different students with different marks. Your program
	 * should print an average mark of each students name. NOTE: please male
	 * different names for instance and local variables.
	 */
	
	
	
	Task(){
		System.out.println("Contructor with no parameter");
	}
	
	Task(String str){
		System.out.println("Constructor with 1 parameter "+str);
	}
}
