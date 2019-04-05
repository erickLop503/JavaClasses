package com.class17;

public class Greetings {

	public static void main(String[] args) {

		Greetings obj = new Greetings();

		obj.hello();

		// how to find largest number

		obj.findLargestNum(30, 4);// calling method findLargest and passing values
		obj.findLargestNum(100, 96);
		obj.findLargestNum(2000, 28387);
        obj.helloToInstructor("Erick");
        obj.helloToInstructor("Kathy");
	}

	void hello() { //method signature 
		System.out.println("Hello"); //method body
	}

	void helloToInstructor(String name) {//method with one parameter
		System.out.println("Hello "+name);
	}
	void findLargestNum(int a, int b) { //method with two parameters

		if (a > b) {
			System.out.println("A is larger then B");
		} else {
			System.out.println("B is larger then A");

		}

	}
}
