package com.class13;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 * 
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String
		 */
		
		String rev="Sunday";
        for(int i=rev.length()-1;i>=0;i--) {
            System.out.print(rev.charAt(i));
        }
	}
}
