package com.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a Java program and store variables to store mortgage rate and mortgage
		 * price. First program should check if rate is higher than 4.5 user will not
		 * buy a house, otherwise user will consider buying. Once user decides to buy a
		 * house, if price of the house is larger than 200000 than user will take a
		 * loan, otherwise user will pay cash.
		 */
		double rate = 4.5;
		int mortgage = 200000;
        
		
		System.out.println("Please enter your rate");
		Scanner scan = new Scanner(System.in);
		rate = scan.nextDouble();

		System.out.println("Please enter your mortgage");
		mortgage = scan.nextInt();

		
		
		
		if (rate < 4.5) {
			System.out.println("you can Not buy a hosue");
		} else {
			System.out.println("You can buy a house ");
		}
		if (mortgage < 200000) {
			System.out.println("You must take a loan");
		} else {
			System.out.println("You can pay cash");
		}
	}
}
