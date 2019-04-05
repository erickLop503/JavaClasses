package com.class17;

public class Task {

	public static void main(String[] args) {
		
		Task obj = new Task();
		obj.largestNumber(23,56);
		obj.twoNumbers(2, 2);
	}
	
	void largestNumber (int a, int b) {
		
		if (a>b) {
			System.out.println("A is larger then B" );
		} else {
			System.out.println("B is larger then A");
		}
	}
	
	void twoNumbers(int a, int b) {
		
		if(a%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
