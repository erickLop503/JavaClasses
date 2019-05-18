package com.class35;

public class ThrowsKeyWord {

	//Throws key word deligate responibility of handly an exception to the caller 
public static String name;
	
	public static void main(String[] args) {

		sleepMode();
	}
	
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("Give some coffee..");
	}
	
	public static void allStudentsSleeping() throws InterruptedException {
		studentSleeping();
	}
	
	public static void sleepMode(){
		try {
			allStudentsSleeping();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
