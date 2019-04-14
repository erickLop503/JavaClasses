package com.class22;

public class StaticVsNonStatic {

	public  String name = "John";//instance variable
	
	public static String lastName = "Snow";//static variable
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.getInfo();
		
		getInfo1();//within same class we can call it by using method/variable name
		
		System.out.println(lastName);
		System.out.println(obj.name);
	}
	//non static - can access both instance and static variables
	void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
		//getInfo1();we can access static methods within non static
	}
	//static method can have access only to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName);// i have error because name is not static

		System.out.println("I am a static method");
	}
}
