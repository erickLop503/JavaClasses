package com.class7;

import java.util.Scanner;

public class Replo {

	public static void main(String[] args) {

		/*
		 * Create main method!!!!!!!!!!!! Scanner Class and Switch case is needed for
		 * this Assignment
		 * 
		 * Write a program using the switch statement Let us consider the scenario
		 * regarding the born baby age
		 * 
		 * First Output: "enter the age of the Child"
		 * 
		 * case 1: if age is 1 print as "You can Crawl"
		 * 
		 * case 2 : if age is 2 print as "You can Talk"
		 * 
		 * case 3: If age is 3 print as "You can Dance"
		 * 
		 * case 4: if age is 4 print as "You can get  Trouble"
		 * 
		 * other than this age (1-4) it should print "I don't know how old you are"
		 */

		
		int age=0;
		String child;
        
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the age of the Child");

		
		age=sc.nextInt();
		
		switch (age) {

		case 1:
			child = "You can Crawl";
			break;
		case 2:
			child = "You can talk";
		    break;
		case 3:
			child = "You can dance";
			break;
		case 4:
			child = "You can get in Trouble";
			break;
		default:
			child = "I don't know how old you are";
			break;
		
		}
          System.out.println(child);
	}

}
