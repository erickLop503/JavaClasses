package com.class23;

public class ConstructorOverLoading {

	ConstructorOverLoading(){
		System.out.println("I am a constructor wiht no parameters ");
	}
	
	ConstructorOverLoading(String str){
		System.out.println("I am a constructor with one parameters");
	}
	
	ConstructorOverLoading(String str, String str2){
		System.out.println("I am a constructor with two parameters");
	}
	
	ConstructorOverLoading(int a){
		System.out.println("I am a constructor with one integer");

	}
}
