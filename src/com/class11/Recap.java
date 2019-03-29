package com.class11;

public class Recap {

	public static void main(String[] args) {

		String[] names = new String[6];
		names[0] = "Erick";
		names[1] = "Jose";
		names[2] = "Jacob";
		names[3] = "Danny";
		names[4] = "Daniel";
		names[5] = "Tavo";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		
		//2.Create an array using array literal
		System.out.println("----------------For loop------------------");
		String[] studentNames = { "Jonh", "Erick", "Daniel", "James", "Messi", "Dybala" };

		for (int i = 0; i <=studentNames.length-1; i++) {
			
			System.out.println(studentNames[i]);

		}
	
	
		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		
		System.out.println("----------------Advance loop-------------");
		for (String student : studentNames) {
			System.out.println(student);
		}
	
	
	
	
	
	
	}
}
