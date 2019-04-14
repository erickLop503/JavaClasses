package com.class22;

public class Child3 extends Parent {

	public static void main(String[] args) {
		Child3 childObject = new Child3();
		System.out.println("Child2 eye color " + childObject.eyeColor);
		System.out.println("Child2 hair color " + childObject.hairColor);
		System.out.println("Child2 has " + childObject.nose + " nose");

	}
	
	public void swim() {
		System.out.println("I can swim");
	}

}
