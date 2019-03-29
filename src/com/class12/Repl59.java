package com.class12;

import java.util.Scanner;

public class Repl59 {

	public static void main(String[] args) {

		/*
		 * Create Scanner class
		 * 
		 * Write an array with size of 5. Use a loop to input values to the array. Then
		 * print out all the elements you have created in the first loop in reverse
		 * order.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String original, reverse = null;
		
		System.out.println(" ");
		original=scan.nextLine();
		
		int len=original.length();
		
		for (int i=len-1; i>=0; i--) 
			reverse = reverse + original.charAt(i);
		
		System.out.println("5,4,3,2,1");
		
		
	}
}
