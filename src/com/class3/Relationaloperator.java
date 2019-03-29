package com.class3;

public class Relationaloperator {

	public static void main(String[] args) {

		int a=19;
		int b=50000;
		
		boolean result = a>b;
		boolean result1 = a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		//Compare 2 numbers and if a is lager then b print-->>
		
		if (a==b ) {
			System.out.println("a is larger then b");
		} else {
			System.out.println("b is larger then a");
		} 
	
		//declare price and if price is higher then expected price----> i will not buy the shoeses
	
		double shoePrice=79.99;
		double allowedPrice=31.99;
		
		if (shoePrice <= allowedPrice) {
			System.out.println("I am buying the shoes");
		} else {
			System.out.println("I am not buying the shoes");
		}
	
	int num=7;
	if (num %2==0) {
		System.out.println("Number is even");
	}else {
		System.out.println("number is odd");
	}
	
	}

}
