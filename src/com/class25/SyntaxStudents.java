package com.class25;

public class SyntaxStudents extends Student {

//	public boolean study() { not possible
//	
//	System.out.println("Syntax students must study HARD");
//	return true;
//}
	
	public void doHomeWork() {
		System.out.println("Syntax Students must do REPL");

	}
	
	public void attendClasses() {
		System.out.println("Syntax Students must attened classes and take notes");

	}
	
	//private methods can not be overriden
	private void doResearch() {
		System.out.println("Syntax Students must make uncle Google");

	}
}
