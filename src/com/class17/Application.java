package com.class17;

//import com.class17_2.ScannerMethod;

public class Application {

	public static void main(String[] args) {
		
	//	ScannerMethod scanMethod = new ScannerMethod();
	//	System.out.println(scanMethod.sum(3, 4));
		
		Application app = new Application();
		System.out.println(app.example6('a'));
		System.out.println(app.example3());

	}
	
	void example() {
		System.out.println("No return value and No Parameters");
	}
	
	void example2(String name) {
		System.out.println("No return value but with parameter : "+ name);
	}
	
	boolean example3() {
		System.out.print("No return value and No Parameters ");
		
		return true;
	}
	
	String example4(String name) {
		System.out.println("No return value but with parameter : "+ name);
		
		return name;
	}
	
	boolean example5(String name) {
		System.out.println("No return value but with parameter : "+ name);

		return false;
	}
	
	long example6(char name) {
		System.out.println("No return value but with parameter : "+ name);

		return name;
	}
}
