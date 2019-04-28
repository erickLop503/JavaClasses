package com.class30;

public interface Shape {

	void calculateAre(double num);
	void calculatePerimeter(double num);
	
}

class Circle implements Shape{

	@Override
	public void calculateAre(double num) {

		
		double area=3.14*(num*num);
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter(double num) {
		
		double perimeter=2*(num*3.14);
		System.out.println(perimeter);		
	}
	
	public void WhoAmI() {
		
	}
	
}

class Square implements Shape{

	@Override
	public void calculateAre(double num) {

		double area=num*num;
		System.out.println(area);
	}

	@Override
	public void calculatePerimeter(double num) {
		
		
			double perimiter=4*num;
			System.out.println(perimiter);
		}
		
	}
	

