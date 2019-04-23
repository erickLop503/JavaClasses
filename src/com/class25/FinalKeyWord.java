package com.class25;

public final class FinalKeyWord {
	
	public static final String name="Syntax";

	public static void main(String[] args) {
		
		//Final Key Word can be used in three places
		//1. final variables - we can not change their value --> CONSTANT
		//2. final methods - we can not override final method --> PREVENT OVERRIDING
		//3. final classes - we CANNOT create a child of final class--> PREVENT INHERITANCE
		
		final String str="Hello";
		//str="John";
		
		//name="School";
	}
	
	public final void hello() {
		System.out.println("Hello from parent class");
	}
}

//class ChildOfFinal extends FinalKeyWord{
	//CANNOT OVERRIDE FINAL METHOD
	//public void hello() {
	//	System.out.println("Hello from parent class");
	//}
	
//}
