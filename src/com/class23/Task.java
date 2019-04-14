package com.class23;

public class Task {

	//Methods that will calculate the area of 
	//->Rectangle 
	//->Square 
	//->Box
	
	
	public void getArea(int a, int b) {
		System.out.println("The area of a rectangle is "+a*b);
	}
	
	public void getArea(int a) {
		System.out.println("The area of a square is "+a*a);
	}
	
	public void getArea(int a, int b, int c) {
		System.out.println("The area of a box is "+a*b*c);
	}
	
}
