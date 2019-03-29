package com.class9;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Write a program that reads a range of integers ( start and end point),
		 * provided by user and then from that range prints the sum of the even and odd
		 * numbers
		 */

		Scanner scan = new Scanner(System.in);

		int start, finish, sumOdd = 0, sumEven = 0;

		System.out.println("Please enter the start point ");

		start = scan.nextInt();
		
		System.out.println("Please enter the end point ");

		finish = scan.nextInt();

		if (start < finish) {
			
			for (int i = start; i < finish; i++) {

				if (i % 2 == 0) {
					sumEven += i;

				} else {
					sumOdd += 1;
				}
			}
			System.out.println("The sum of odd numbers in your range " + start + " to " + finish + " is " + sumOdd);
			System.out.println("The sum of even numbers in your range " + start + " to " + finish + " is " + sumEven);
		}
	}
}
