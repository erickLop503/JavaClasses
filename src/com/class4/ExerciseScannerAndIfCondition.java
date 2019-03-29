package com.class4;

public class ExerciseScannerAndIfCondition {

	public static void main(String[] args) {

		double gpa = 3.6;
		double expectedGpa = 3.7;
		boolean hasDiploma = true;

		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa > expectedGpa) {
				System.out.println("You are hired");
			} else {
				System.out.println("Unfortunately we cannot hire you");
			}
		} else {
			System.out.println("Please get your degree");
		}

		/*
		 * write a program to check work eligibility if user is younger than <16 --> not
		 * allowed to work otherwise --> allow to work. if user is younger than 64--> go
		 * to work otherwise --> enjoy your life
		 */

		int age = 65;
		int eligibleAge = 16;
		int retirementAge = 64;

		if (age < eligibleAge) {
			System.out.println("You are too young, no work for you");
		} else {
			System.out.println("You are eligible ot work");
			if (age < retirementAge) {
				System.out.println("Go work hard");
			} else {
				System.out.println("Please enjoy your life. You do need to work");
			}
		}

	}
}
