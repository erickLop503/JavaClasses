package com.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/*
		 * Program to find largest number among 
		 */
	
	
	          int num1, num2, num3, largest;
	
	          Scanner sc=new Scanner(System.in);
	          
	         System.out.println("Please enter 3 distinct numbers");
	         num1 = sc.nextInt();
	         num2 = sc.nextInt();
	         num3 = sc.nextInt();
	        
	         
	   if (num1==num2 && num2==num3 && num2==num3) {
	         
		   if (num1>num2) {
	        	          if (num1>num3) {
	        		         largest=num1;  //System.out.println(num1 + " is the largest");
	        	          } else {
	        		         largest=num3; //System.out.println(num3 + " is the largest");
	        	          }
	        } else { //assuming num2>num1
	        		 
	        		      if (num2>num3) {
	        		         largest=num2; //System.out.println(num2 + " is the largest");
	        	          } else {
	        		         largest=num3; // System.out.println(num3 + " is the largest");
	        	          }
	        }
	         
	        System.out.println("The largest number is " + largest);
	
	
	
	
	   }
	
	}
}
