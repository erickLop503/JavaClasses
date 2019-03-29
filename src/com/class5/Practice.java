package com.class5;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		

		/*
		 * Write a program that asks the user's age and then display it by adding 10 i.e (age + 10)

             First Output: "Enter your age"
              Final Output: "your age after 10 years is " remember to put the value in your final output with 10 years added to it

		 */
		
		
		Scanner scan;
		
		System.out.println("Enter your age ");
		
		scan = new Scanner(System.in);
		 int age=10;
		  age = scan.nextInt();
		
		 System.out.println("your age after 10 years is " + age);
		//System.out.println("Please Enter Surname ");
		
		//String name1 = scan.nextLine();
		
		//System.out.println("your age after 10 years is " + age);
		
	}

}
