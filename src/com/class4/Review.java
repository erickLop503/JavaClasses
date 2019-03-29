package com.class4;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		
		//write a program to find out a person name, gender, age, mobile number 
		
		System.out.println("Please enter your name ");
		Scanner scan =new Scanner (System.in);
	
	String name =scan.nextLine();
	System.out.println("Your name is " + name);
	
	System.out.println("Please enter your gender");
	String gender=scan.nextLine();
	System.out.println("Your gender is " + gender);
	
	System.out.println("Please enter your age");
	int age=scan.nextInt();
	System.out.println("Your age is " + age);
	
	System.out.println("Please enter your mobilNumber");
	long  mobilNumber=scan.nextLong();
	System.out.println("Your mobile number is " + mobilNumber);
	
	}
}
