package com.class25;

public class Student {

	 void study() {
		System.out.println("Students must study");
	}
	
	protected void doHomeWork() {
		System.out.println("Students must do homework");

	}
	
	void attendClasses() {
		System.out.println("Students must attened classes");

	}
	
	//PRIVATE METHOD CANNOT BE OVERRIDDEN
	private void doResearch() {
		System.out.println("Students must do research");

	}
}
