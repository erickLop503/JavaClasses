package com.class28;

public class TestVehicle {

	
	public static void main(String[] args) {
		
		Car car=new BMW("bmw");
		car.drive();
		car.start();
		car.stop();
		
		Vehicle.diplayTotalVehicles();
		
		new BMW("M4");
		new Toyota("Camry");
		
		Vehicle.diplayTotalVehicles();


	}
}
