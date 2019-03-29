package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		
		// Prompt user to ask the name 3 times and print "You are doing great_________"
		
		Scanner scan;
		String name;
		
		int a=1;
		
		scan = new Scanner (System.in);
		
		while (a<=3) {
			System.out.println("Please enter your name ");
		    name=scan.nextLine();
		    
		    System.out.println("You are doing great " + name );
		    
		    a++;
		}
	}
}
