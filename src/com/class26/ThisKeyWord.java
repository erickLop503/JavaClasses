package com.class26;

public class ThisKeyWord {
	
	int num1,num2;

	public ThisKeyWord() {
		System.out.println("No parameters here");
		
	}
	
	public ThisKeyWord(int num1, int num2) {

		this.num1=num1;
		this.num2=num2;
	}
	
	public void sum(int num1, int num2) {
		System.out.println("The summ of local variables "+(num1+num2));
		System.out.println("The sum of instance variables "+(this.num1+this.num2));
	}
}
