package com.class29;

public class CarTest {

	public static void main(String[] args) {
		
		Car obj=new Truck(25000, "Blue", 3000);
		double carPrice=obj.calculateSalePrice();
		System.out.println(carPrice);
	}
}
