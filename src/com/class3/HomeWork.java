package com.class3;

public class HomeWork {

	public static void main(String[] args) {

		int num = 90;
		if (num % 2 == 0) {
			System.out.println(num + " Number is even");
		} else {
			System.out.println(num + " number is odd");
		}
/////////////////////////////////////////////////////////////////////////////
		int a = 14;
		int b = 2;

		System.out.println(a % b);

		// Write a program to check whether number is positive or negative

		int number = 4358;

		if (number > 0) {
			System.out.println("Number is positive");
		} else if (number < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("The value of number is equals to " + number);
		}
//////////////////////////////////////////////////////////////////////////////
	
		boolean isRainning=true;
		
		if (isRainning) {
			System.out.println("Stay home and sleep");
		} else {
			System.out.println("Take a walk and listen java");
		}
	
	}

}
