package com.class23;

public class Employee {

    protected static String department="IT";
	int salary;
	protected int salary1;
	
	public void getPaid() {
		System.out.println("Employee get's paid "+salary);
	}
	
   public static void work() {
		System.out.println("Employee works in "+department);
	}
   
   protected void checkMethod() {
	   System.out.println("I am a protected method");
   }
   
   void checkMethod1() {
	   System.out.println("I am a default method");
   }
}
