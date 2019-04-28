package com.class30;

public class TestShape {

	public static void main(String[] args) {
		
		Circle circle=new Circle();
		circle.calculateAre(20.5);
		circle.calculatePerimeter(40);
		circle.WhoAmI();
		
		Shape obj=new Circle();
		obj.calculateAre(10);
		obj.calculatePerimeter(20);
	}
}
