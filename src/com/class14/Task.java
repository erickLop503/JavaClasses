package com.class14;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 * 
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 * 
		 * You have a String a=“Is it saturday! Is it raining! Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */
		
		
		String str= "Today barca is playing and they suck";
		System.out.println(str.replace(" ", ""));
		
		String str0= "12%*0Hello World&!35";
		String newString = str0.replaceAll("[0-9 A-Z a-z]", "");
        System.out.println(newString.length());
	
        String a="Is it saturday! Is it raining! Do we have a Java Class today?";
        String[] array=a.split("!");
		System.out.println("The length of the array is "+array.length);
	

		for(String subString:array) {
			System.out.println(subString);
		}
	
	}
}
