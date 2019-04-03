package com.class15;

import java.util.Scanner;

public class IQuestion {

	public static void main(String[] args) {
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
	}
}
