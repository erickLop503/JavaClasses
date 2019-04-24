package com.class27;

public class Student {

	/*
	 * 1. Write program as a student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student by the displayInfo method. 
	 * 2. Write program as a student class that has instance variables name and address. Create a
	 * constructor that will initialize those variables. Print name & address of
	 * given student by the displayInfo method.
	 */
	
	String name;
	String address;
	
	Student(String name, String address){
		
		this. name=name;
		this. address=address;
	}
	
	void sudentDatails() {
		System.out.println("Student name is "+name+" and address is "+address);
	}
	
	public static void main(String[] args) {
		
		Student obj=new  Student("Erick", "Virginia");
		obj.sudentDatails();
		
	}
	
}
