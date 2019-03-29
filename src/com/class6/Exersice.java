package com.class6;

import java.util.Scanner;

public class Exersice {

	public static void main(String[] args) {

		
		Scanner sc;
		String country;
		String lenguage;
		
		System.out.println("Please enter your country ");
		sc = new Scanner(System.in);
		
		country=sc.nextLine();
		
		switch (country) {
		
		case "USA": 
			lenguage="English";
		    break;
		case "Honduras":
			lenguage="Spanish";
			break;
		case "Brazil":   
		    lenguage="Portuguese";
		    break;
		case "France":
		    lenguage="French";
		    break;
		case "Germany":
			lenguage="German";
		    break;
		case "Italy":
		    lenguage="Italian";
		    break;
		default :
			lenguage="That country doesn't exist";
		
	    
			
		
		}
		System.out.println("You speak "+ lenguage);    //This goes outside of the block of code
	}

}
