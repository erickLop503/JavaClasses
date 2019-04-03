package com.class14;

import java.util.Scanner;

public class interviewQuestions1 {

	public static void main(String[] args) {

		// 6. Write a Java Program to find whether a String is palindrome or not?
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
		a = s.nextLine();
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not palindrome.");
		}

		// otherWay to do it
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word to check if it a palidrome!");
		String word = scan.nextLine();

		String reverse = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}

		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome ");
		} else {
			System.out.println("The word is not a palidrome");
		}

//--------------------------------------------------------------------------------------------------------------		

		// 7. Write a java program to check whether a given number is prime or not?
		// PrimerNumber shoild meet 2 conditions: divisible by 1 and byItself ONLY

		int temp;
		boolean isPrime = true;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter any number:");
		// capture the input in an integer
		int num = scaner.nextInt();
		scaner.close();
		
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
//----------------------------------------------------------------------------------------------------------		  

		
		
		// 8. Write a Java Program to print first 10 numbers of Fibonacci series.
		int p=1;
		int k=0;
		int u=0;
		
		for (int i=0; i<10; i++) {
			u=p+k;
			p=k;
			k=u;
			System.out.println(p+" ");
		}
	}
}
