package com.class17_2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		//Ask a user to enter a leap year, give the user 10 chances to enter a correct leap year
		//As soon as the user enters the correct leap year exit the loop.
		
		//leap year
		
		Scanner scan;
		int year;
		
		scan=new Scanner (System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Please enter a guees leap year");
			year=scan.nextInt();
			
			if (year%4==0) {
				System.out.println("The year is a leap year");
				break;
				
			} else {
				System.out.println("The year is not a leap year");
			}
			
			
		}
		
	}
}
