package com.class36;

public class ThrowKeyWord {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b);// new ArithmeticException
		
		//if person is >18 yo --> issue driver license else --> throw an exception
		
		checkAgeEligibility(17);
		twoNumDiv(10, 0);
		checkUserNameLength("er");
		withdraw(198.58, 2000);
	}
	
	public static void checkAgeEligibility(int age) {
		
		if(age>=18) {
			System.out.println("Congratulations on your driver license");
		}
		else {
			throw new ArithmeticException("You are not eligible to get driver license");
		}
	}
	
	public static void twoNumDiv(int a, int b) {
		
		if (b!=0) {
			System.out.println(a/b);
		} else {
			throw new ArithmeticException("We cannot divede by zero");
		}
	}
	
	public static void checkUserNameLength(String userName) {
		
		if (userName.length()>3) {
			System.out.println("UserName is accepted");
		} else {
			throw new NullPointerException("UserName must be longer than 3 characters");
		}
	}
	
	// create an exception: when user is trying to withdraw larger amount that the balance 
	//throw an exception saying "You do not have enough money"
	
	public static void withdraw(double balance,double amount) {
		
		
		if (amount<=balance) {
			System.out.println("You can get your money");
		} else {
			throw new ArithmeticException("You do not have enough money");
		}
	}
}
