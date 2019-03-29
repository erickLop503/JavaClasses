package com.class8;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {

		/*
		 * Write a program using the switch statement Let us consider there are three
		 * students in the class with roll number starting from (101 to 103) if any
		 * number other than 101-103 are present display
		 * "Not found Student name: in Class"
		 * 
		 * First Output: "enter the roll number of the Child"
		 * 
		 * case 101: if roll number is 101 print as "Student name: Ramesh "
		 * 
		 * case 102 :if roll number is 102 print as "Student name: Mahesh "
		 * 
		 * case 103:if roll number is 103 print as "Student name: Mukesh "
		 * 
		 * other than this roll number it should print
		 * "Not found Student name: in Class"
		 * 
		 */

		Scanner scan = new Scanner(System.in);
//
//		System.out.println("enter the roll number of the Child");
//
//		int student;
//		student = scan.nextInt();
//
//		String studentName;
//		studentName = scan.nextLine();
//
//		switch (student) {
//
//		case 101:
//			studentName = "Ramesh";
//			break;
//
//		case 102:
//			studentName = "Mahesh";
//			break;
//
//		case 103:
//			studentName = " Mukesh";
//			break;
//
//		default:
//			studentName = "Not found Student name: in Class";
//
//		}
//
//		System.out.println(studentName);

		
		System.out.println("Please enter a number");
		
		int month;
		month=scan.nextInt();
		
		String nameMonth;
		
		
		switch (month) {
	    
        case 1:
        	nameMonth = "January";
		     break;
        case 2:
        	nameMonth = "February";
	         break;
        case 3:
        	nameMonth = "March";
			 break;
        case 4:
        	nameMonth = "April";
			 break;
        case 5:
        	nameMonth = "May";
			 break;
        case 6:
        	nameMonth = "June";
			 break;
        case 7:
        	nameMonth = "July";
			 break;
        case 8:
        	nameMonth = "August";
			 break;
        case 9:
        	nameMonth = "September";
		     break;
        case 10:
        	nameMonth = "October";
	         break;
        case 11:
        	nameMonth = "November";
			 break;
        case 12:
        	nameMonth = "December";
			 break;
        default:
        	nameMonth = "Invalid";
		     break;
		
		
		}
	System.out.println(nameMonth);
	
	}

}
