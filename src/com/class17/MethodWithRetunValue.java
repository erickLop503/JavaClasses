package com.class17;

public class MethodWithRetunValue {

	public static void main(String[] args) {
		
		String str="Hello";
		
		int stringLength=str.length();
		System.out.println(stringLength);
		
		char charCharater=str.charAt(3);
		System.out.println(charCharater);
		
		
		MethodWithRetunValue obj = new MethodWithRetunValue();
		//obj.askHowAreYou("erick);
		String day=obj.whatIsADay();
		System.out.println("Today is"+day);
	}
	
	//void is a return type, askHowAreYou-method name 
		void askHowAreYou (String name) {
			System.out.println("How are you "+name);
		}
		
		String whatIsADay() {
			System.out.println("I am inside the method");
			return "Thursday";
		}
		
		int findLargestNum(int a, int b) { //method with two parameters

			if (a > b) {
              return a;
			} else {
			  return b;

			}
		}
}
