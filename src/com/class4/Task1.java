package com.class4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		int loan;
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter your loan ");
		 
		 loan=scan.nextInt();
		 
		 if (loan<200000) {
			 System.out.println("i can lend you money");
		 }  else  {
			 System.out.println(" I can't lend you the money");
		 }
	}
}
