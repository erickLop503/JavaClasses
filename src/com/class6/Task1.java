package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
	     * Write a program that prints out if it is good weather to go for any activity
	     * or not
	     *
	     * If the temperature is between 40 degrees and 80 degrees inclusive & no
	     * rain--> we will go for hiking otherwise--> we will not go hiking If
	     * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
	     * otherwise we are not going snowboarding it if temperature is more than 80 &
	     * sunny--> go to the beach otherwise --> not go to the beach
	     */
		
		
		
		
		Scanner scan;
		boolean snow, rain, sunny;
		int temp ;
		String activity ;
		
		scan = new Scanner(System.in);
		
		System.out.println("Please enter your tempeture");
		
		temp = scan.nextInt();
		
		
		if (temp >=40 && temp <=80) {
		    System.out.println("it is raining");
		rain=scan.nextBoolean();
	         if (rain) {
	        	 activity = "Stay home";
	         } else {
	        	 activity = "Go hiking";
	         }
		
		
		} else if (temp>=25 && temp<40) {
			System.out.println("It is snowing ");
		snow=scan.nextBoolean();
		     if (snow) {
		    	 activity = "Snow boarding";
		     } else {
		    	 activity = "Watch a movie";
		     } 
		     
		
		} else if (temp > 80) {
		    	 System.out.println("It is sunny");
		sunny=scan.nextBoolean();
		     if (sunny) {
		    	 activity = "Go to to the beach";
		     } else {
		    	 activity = "Keep coding";
		     }
		
		} else {
			System.out.println(" Please enter a valid tempeture");
		         activity = "Unknown";
		} 
		    System.out.println("My activity for today is " + activity);
      }
}
