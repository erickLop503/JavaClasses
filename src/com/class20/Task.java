package com.class20;

public class Task {

	public static void main(String[] args) {
		Task.createEmail("erick@gmail.com");
		Task.name("Daniel ");
		Task.lastName("Lopez ");

		Task obj = new Task();
		String email = obj.creatingEmail("Dan", "Lopez", "yahoo");
		System.out.println(email);

		email = obj.creatingEmail("Bob", "Snow", "outlook");

		char myGrade=obj.getGrade(65);
		System.out.println("My grade at syntax is "+myGrade);
	}

	static void createEmail(String email) {

		System.out.println(email);
	}

	static void name(String name) {
		System.out.println(name);
	}

	static void lastName(String lastName) {
		System.out.println(lastName);
	}

	String creatingEmail(String name, String lastName, String emailType) {

		String email = name + lastName + " @" + emailType + ".com";
		return email.toLowerCase();
	}

	/*
	 * create a class student that will have a method getGrade your method should
	 * accept the score of a student return a grade score >90 - A score >80 - B
	 * score >70 - C score >50 - D anything else - F
	 */

	char getGrade(int score) {

		char grade;

		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;

	}

}
