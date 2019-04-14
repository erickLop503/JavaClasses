package com.class21;

public class Employee {

	/*
	 * Create a Class called Employee: Create three variables eID , salary and set
	 * the CEO to “Sumair” Create two objects of the class Employee Set the value of
	 * eID, salary for each of the objects Print out the eID , salary and CEO for
	 * each of the objects
	 */
	
	String eID;
	int salary;
	String CEO="Sumair";
	
	public static void main(String[] args) {
		
		Employee Employee1 = new Employee();
		Employee1.eID="Waqas";
		Employee1.salary=1000;
		Employee1.getEmployeeInfo();
		
		Employee Employee2 = new Employee();
		Employee2.eID="Arrf";
		Employee2.salary=2000;
		Employee2.getEmployeeInfo();
		
	}
	
     void getEmployeeInfo() {
		System.out.println("CEO "+CEO+" eID is "+eID+" employees salary is "+salary);
	}
	
}
