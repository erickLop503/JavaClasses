package com.class5;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean creditCard = true;
		int balance = 900;
		
		if (creditCard) {
			System.out.println("Let's check the balance");
		         
			if (balance>=1000) {
			      System.out.println("Pay off now");
		         } else  {
			     System.out.println("you are good");
			     
			     }
		} else {
			System.out.println("Do ypo want a credit card");
		} 
	}

}
