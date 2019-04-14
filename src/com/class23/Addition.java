package com.class23;

public class Addition {
	
	//1. over loading methods by changing number of parameters 
	public void add(int a, int b) {
		System.out.println("Method to add two integer");
		System.out.println(a+b);
	}
	
	public void add(int a) {
		System.out.println("Method to add one integer and one integer");
		System.out.println(a+100);
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Method to add three integer");
		System.out.println(a+b+c);
	}
    //2. overloading method by changing the data type of parameters
	public void add(double a, double b) {
		System.out.println("Method to add two double");
		System.out.println(a+b);
	}
	
	public void add(int a, double b) {
		System.out.println("Method to add one integer and one double");
		System.out.println(a+b);
		
	}


	public void add(double a, double b, double c) {
		System.out.println("Method to add three double");
		System.out.println(a+b+c);
	}


}
