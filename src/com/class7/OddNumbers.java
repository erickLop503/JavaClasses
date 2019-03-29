package com.class7;

public class OddNumbers {

	public static void main(String[] args) {

		// Print only odd numbers from 1 to 20

		int num = 1;

		while (num <= 20) {
			System.out.println("I am inside the while loop");

			if (num % 2 != 0) {
				System.out.println(num);
				
			}
			    num++;
		}
          //Print only even numbers from 10 to 100
		
		
		int num1 = 10;

		while (num <= 100) {
			System.out.println("I am inside the while loop");

			if (num % 2 == 0) {
				System.out.println(num);
				
			}
			    num++;
		}
		
	}

}
