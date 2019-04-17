package com.class24;

public class Class {

	 //2. Create 1 class with a static method that has 3 overloaded forms. 
	 //  Then call each overloaded method with specific arguments and observe result.

	static void barca(int num) {
		System.out.println(num);
	}
	
    static void barca(String str, int num) {
		System.out.println(str+num);
	}
    
    static void barca(boolean no) {
		System.out.println(no);
	}
    
    public static void main(String[] args) {
		
    	Class.barca(2); 
    	Class.barca("Erick ",9);
    	Class.barca(false);
	}
}
