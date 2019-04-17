package com.class24;

/*
 * Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”.
 *  Class ‘Degree’ has two subclasses namely ‘Undergraduate’ and 
 * ‘Postgraduate’ each having a method with the same name that prints 
 * “I am an Undergraduate” and “I am a Postgraduate” respectively. 
 * Call the method by creating an object of each of the three classes.
 */
public class Degree {

	public void getDegree() {
	 System.out.println("I got degree");
	}
}

class Undergraduate {
	
	public void getDegree() {
		 System.out.println("I got degree");
		}
	
}

class Postgraduate{
	
	public void getDegree() {
		 System.out.println("I got degree");
		}
}
