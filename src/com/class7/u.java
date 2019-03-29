package com.class7;

import java.util.Scanner;

public class u {

	public static void main(String[] args) {

		/*
//		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: Your favorite car is ___
		 */
		
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter your favorite car make");
		
		String carName;
		carName=scan.nextLine();
		
		String origen;
		
		
		
		switch (carName) {
		
		case "BMW":
			origen="german car";
			break;
			
		case "Toyota":
			origen="japanese car";
			break;
			
		case "Maserati":
			origen="italian";
			break;
			
		default:
			origen="unknown";
		    break;
		    
		
		}
		System.out.println("Your favorite car is "+origen);
	}
}
