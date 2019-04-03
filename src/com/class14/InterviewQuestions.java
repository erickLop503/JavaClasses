package com.class14;

import java.util.Arrays;

public class InterviewQuestions {

	public static void main(String[] args) {

		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		// strings without a temporary variable?

		// swap numbers
		int a = 10;
		int b = 20;
		a = a + b; // a=10+20=30
		b = a - b; // b= 30-20=10
		a = a - b;// a=30-10=20
		System.out.println(a);
		System.out.println(b);

		// swap Strings
		String x = "Hello";
		String y = "Welcome";
		x = x + y; // HelloWelcome
		y = x.substring(0, (x).length() - y.length());
		x = x.substring(y.length());
		System.out.println(x);
		System.out.println(y);

		// 2.2.Write a java program to find the second largest number in the array?
		// Maximum and minimum number in the array?

		// Esiest way
		int[] numArray = { 12, 13, 12, 15, 0, -1 };
		Arrays.sort(numArray);
		System.out.println(numArray[numArray.length - 2]);

		// This is second way to do it
		int arr[] = { 14, 46, 0, 100, 86, 92, -1 };

		int minimum = arr[0];
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		System.out.println("Minimum number is:" + minimum);
		System.out.println("2nd largest number is:" + secondLargest);
		System.out.println("Largest number is:" + largest);

		// 3. Find out how many alpha characters present in a string?
		String given = "wefeqf878979797fewfewrf879797efds&^&^*^*^";

		// one way
		String replaced = given.replaceAll("[a-zA-Z]", "");
		int alphaChar = given.length() - replaced.length();
		System.out.println(alphaChar);
		// Second way
		String replaced1 = given.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced1.length());

		// 4.How to find out the part of the string from a string? What is substring?
		// Find number of words in string?
		String z = "Welcome to the interview sessions with Syntax";
		System.out.println(z.substring(39));

		String[] words = z.split(" ");
		System.out.println(words.length);

		for (String string : words) {
			System.out.println(string);
		}

		// 5. Write a java program to reverse String? Reverse a string word by word?

		/*
		 * Write a java program to reverse String? Reverse a string word by word?
		 */

		String sentence = "Sunday is Java class ";
		String reverse = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse = reverse + sentence.charAt(i);
		}
		String[] words1 = reverse.split(" ");
		for (int i = words1.length - 1; i >= 0; i--) {
			System.out.print(words1[i] + " ");
		}

	}
}
