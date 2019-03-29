package com.class4;

public class Task3 {

	public static void main(String[] args) {
		
	/*	Write a program to ask user to enter numbers of worked years and annual salary. 
	 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
	 * otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, 
	 * otherwise bonus=3000.
	*/
	
		int workedYears = 9;
	    int annualSalary = 7000;
	    
	    if (workedYears>=5) {
	    	System.out.println("Worker is eligible for the bonus");
	    } else  {
	    	System.out.println("Worker is Not eligible for the bonus");
	    } if (annualSalary>5000) {
	    	System.out.println("bonus salary will be 5000");
	    } else {
	    	System.out.println("bonus salary will be 3000");
	      }
	}
}
