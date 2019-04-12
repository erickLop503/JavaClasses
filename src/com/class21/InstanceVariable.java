package com.class21;

public class InstanceVariable {

	protected String name= "John";//instance variables can have access modifiers
	
	public static void main(String[] args) {

		String name="Anna";
		System.out.println(name);
		System.out.println("---Changing value of local variable------");
	    name = "Olga";
		System.out.println(name);
		//creating 1 object
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.name);
		System.out.println("---Changing value of Instance variable------");
		obj.name="Jack";
		System.out.println(obj.name);
		//creating 2 object
		InstanceVariable obj1 = new InstanceVariable();
        System.out.println(obj1.name);
	}
	
	public void hello() {
		System.out.println("Hello"+name);
	}

}
