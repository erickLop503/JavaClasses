package com.class21;

public class Car {

	public String color;//null for String
	public static int totalCars;//0 for integer//0+1=1+1=2
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color="white";
		car1.totalCars++;
		
		Car car2 = new Car();
		car2.color="white";
		car2.totalCars++;
		
		System.out.println("Total car we made is "+totalCars);
		
	}
}
