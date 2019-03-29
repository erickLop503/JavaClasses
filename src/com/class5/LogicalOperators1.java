package com.class5;

import java.util.Scanner;

public class LogicalOperators1 {

	public static void main(String[] args) {

		
		Scanner  scan;
		int sales;
		int commision;
		
		scan =new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales = scan.nextInt();
		
		if (sales>0 && sales<100) {
			commision=2;
		} else if (sales>=100 && sales<200) {
			commision=5;
		} else if (sales>=200 && sales <500) {
			commision=10;
		} else if (sales>500) {
			commision=20;
		} else {
			commision=0;
		}
		
		System.out.println("Your commision is " + commision);
	}

}
