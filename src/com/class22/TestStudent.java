package com.class22;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student("Dan",78,80,90);
		student1.findAverage();
		
		Student student2 = new Student("Erick",46,70,50);
		student2.findAverage();
		
		Student student3 = new Student("Jacob",78,100,90);
		student3.findAverage();
		
		Student student4 = new Student("Jose",65,80,97);
		student4.findAverage();
		
		Student student5 = new Student("Nelson",50,67,90);
		student5.findAverage();
	}
}
