package com.class26;

public class Students {

	String fullName;
	int age;
	
	//this is used to differentiate b/w local instance variables
	public Students(String fullname, int age){
		
		this.fullName=fullname;
		this.age=age;
	}
	
	void displayDitails() {
		System.out.println("Student full name is "+ fullName+" and age is "+ age);
	}
	
	public static void main(String[] args) {
		
		Students obj = new Students("Erick", 30);
		obj.displayDitails();
	}
}
