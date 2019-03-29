package com.class12;

import java.util.Scanner;

public class Repl58 {

	public static void main(String[] args) {

		/*
		 * Note: Create a Scanner Class Create an int array with the size of 5 and input
		 * values with Scanner. Print out each element of the array multiplied by ten,
		 * one element per line. Create a loop and enter values into one loop, the
		 * second loop print the values and it must be multiplied by 10.
		 */

		Scanner scan = new Scanner(System.in);

		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {

			num[i] = scan.nextInt();

		}
		for (int a = 0; a < num.length; a++) {

			System.out.println(num[a]*10);

		}
	}
}
