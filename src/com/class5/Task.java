package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Prompt the user to enter two people's heights in inches. Each person should
		 * be classified as one of the following: • short (under 5 feet) • medium(5 to 6
		 * feet) • tall (6 feet and over)
		 */

		System.out.println("Please enter your height");

		Scanner sc = new Scanner(System.in);

		double heigth;
		heigth = sc.nextDouble();

		if (heigth <= 5) {
			System.out.println(" Short");
		} else if (heigth > 5 && heigth < 6) {
			System.out.println("medium");
		} else if (heigth >= 6) {
			System.out.println("tall");
		} else {
            System.out.println("Enter valid heigth");
		}

	}

}
