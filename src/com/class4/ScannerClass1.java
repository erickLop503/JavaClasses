package com.class4;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		System.out.println("Enter your name ");
		
		Scanner inPut=new Scanner(System.in);
		String name=inPut.nextLine();
		
		System.out.println("Your name is " + name);
	
		String ask=inPut.nextLine();
		System.out.println("How are you" +ask);
	}
}
