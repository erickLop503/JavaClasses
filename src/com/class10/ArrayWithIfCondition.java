package com.class10;

public class ArrayWithIfCondition {

	public static void main(String[] args) {

		/*
		 * Write a program to test if an array contains a specific value.
		 *
		 * Hint: use a boolean flag
		 */

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int item = 9;
		boolean found = false;

		for (int n : arr) {
			if (item == n) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Found it");
		} else {
			System.out.println("Couldn't find it");
		}
	}

}
