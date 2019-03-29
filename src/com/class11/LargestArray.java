package com.class11;

import java.util.Scanner;

public class LargestArray {

	// Could be an interview question----------
	
	//Create an array of integers and find the largest number
	
	public static void main(String[] args) {

		int[] integers = {12, 23, 2, 4, 984, 34, 198888 };

		int largest = integers[0];
		for (int i = 0; i < integers.length; i++) {

			if (integers[i] > largest) {
				largest = integers[i];

			}
		}
	     System.out.println("The largest number is "+largest);
	}
}
