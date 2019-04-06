package com.class17_2;

import java.util.Scanner;

public class ScannerMethod {

	public static void main(String[] args) {
		
		ScannerMethod obj = new ScannerMethod();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a");
		int a=scan.nextInt();
		System.out.println("Enter b");
		int b=scan.nextInt();
		System.out.println("The sum of a + b is equal to: "+obj.sum(a,b));
//      obj.sum(100, 50);
//		obj.sum(1, 2);
//		obj.sub();
		
	}
	
	public int sum(int x, int y) {
		
	   return x+y;
	}
	
	void sub() {
		int a=10;
		int b=12;
		
		System.out.println(a-b);
	}
}
