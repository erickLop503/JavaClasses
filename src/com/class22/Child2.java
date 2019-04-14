package com.class22;

public class Child2 extends Parent{
	
	public static void main(String[] args) {

		Child2 childObject = new Child2();
		System.out.println("Child2 eye color " + childObject.eyeColor);
		System.out.println("Child2 hair color " + childObject.hairColor);
		System.out.println("Child2 has " + childObject.nose + " nose");
		childObject.sing();
		childObject.dance();
		
	}
	
	public void dance() {
		System.out.println("I can dance");
	}
	
	

}
