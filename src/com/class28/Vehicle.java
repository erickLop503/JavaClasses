package com.class28;

public abstract class Vehicle {

    static int vehicleCount;
	
	
	Vehicle(){
		vehicleCount++;
	}
	
	//public static abstract void gps(); cannot have static abstract methods(cannot override static)
	//private abstract void speed(); cannot have private abstract methods (do not part of inheratance)
	//public abstract final void break(); cannot have abstract final method
	public abstract void start();

	public abstract void drive();

	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	
	public static void diplayTotalVehicles() {
		
		System.out.println("Total cars we builded = "+vehicleCount);
	}

}

abstract class Car extends Vehicle {

	//by default compiler will create a default constructor and by default inside the child constructor
	//we call a parent class constructor
	
	//Car(){
   // super(); added by default
  //  }
	
	public String make;//instance variables allowed in the abstract class
	//we cannot create an object of abstract class, but since we have an instance variables 
	//inside the class we need someone to initialize them-->  performed by constructor
	
	Car (String make){
		this.make=make;
	}
}

class BMW extends Car {//

	//by default compiler will create a default constructor and by default inside the child constructor
		//we call a parent class constructor
		
		//BMW(){
	   // super();
	  //  }
	public String make;//instance variables allowed in the 
	//we cannot create an object of abstract class, but since we have an instance variables 
	//inside the class we need someone to initialize them-->  performed by constructor
	
	BMW(String make){
		super(make);
	}
	@Override
	public void start() {
		System.out.println("BMW car starts remote");
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
	}

}

class Toyota extends Car {
	
	//public String make;

	Toyota(String make){
		super(make);
	}
	@Override
	public void start() {
		System.out.println("Toyota cars starts with push button");
	}

	@Override
	public void drive() {
		System.out.println("Toyota cars drives safe");
	}

}
