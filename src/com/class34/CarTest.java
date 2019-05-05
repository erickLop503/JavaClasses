package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CarTest {

	public static void main(String[] args) {
		
		//create a map in which we will store the carNumber and carObject
		
//		Car car1=new Car("Toyota", "Corolla");
//		Car car2=new Car("Honda", "Civic");
//		Car car3=new Car("Nissan", "Sentra");

//		car1.printCarDetails();
//		car2.printCarDetails();
//		car3.printCarDetails();

		Map<Integer, Car> carMap= new HashMap<>();
		carMap.put(1, new Car ("BMW", "M3"));
		carMap.put(2, new Car ("Audi", "S4"));
		carMap.put(3, new Car ("Subaru", "STI"));

		Collection<Car> carValues=carMap.values();
		for(Car car:carValues) {
			car.printCarDetails();
		}
		
	}
}
