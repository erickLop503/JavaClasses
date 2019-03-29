package com.class4;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Task {

	public static void main(String[] args) {

		/*
		 * Ask user to enter city and temperature in Fahrenheit Your program should
		 * convert F-->C Your program should say “The temperature in the city ___is ___”
		 */

		String cityName;
		int temp;

		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName = myScanner.nextLine();

		System.out.println("Please enter temperature in Fahrenheit");
		temp = myScanner.nextInt();
		// formula (F − 32) × 5/9;

		int convertedTemp = (temp - 32) * 5 / 9;

		System.out.println("the temperature in the city " + cityName + " is " + convertedTemp + "C");

		// write a java program with two boolean values summer and sunny
		// As a family we go on vacation ONLY when it's the summer time
		// Once we are on vacation we like to go to the beach ONLY when is sunny outside
       //IF NESTED
		
		
		boolean summer = true;
		boolean sunny = true;

		if (summer == true) {

			if (sunny == true) {
				System.out.println("we're going to the beach");

			} else {
				System.out.println("we're are not going to the beach");
			}

		} else {
			System.out.println("it's not sunny");
		}
	}
}
