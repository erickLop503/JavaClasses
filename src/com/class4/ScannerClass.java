package com.class4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		//number from a user and print that number
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter any number");
		
		int myNumber=scan.nextInt();
		System.out.println("The number you entered is " + myNumber);
		
		System.out.println("enter other number ");
	
		int otherNum=scan.nextInt();
		
		System.out.println("your other number is " +otherNum);
	
	
	
	
	}
}
