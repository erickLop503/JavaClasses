package com.class20;

import java.util.Scanner;

public class Task2 {

	// Create a method that will take a String and return whether String is
	// * palindrome or not. Method should available to all classes within your
	// * projects.
	
	public boolean isPalinddrome(String str) {
		
		String reversed = "";
		boolean flag=false;
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}
		
		if (reversed.equalsIgnoreCase(str)) {
			flag=true;
		} else {
			return false;
		}
		return flag;
	}
	
}

