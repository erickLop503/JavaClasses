package com.class26;

public class SuperWithConstructor {

	public SuperWithConstructor() {
		System.out.println("I am a parent class constructor");
	}
	
	public SuperWithConstructor(String str) {
		System.out.println("I am a parent class constructor with 1 parameter");
	}
}

class ChildOfSuperWithConstructor extends SuperWithConstructor{
	
	
	public ChildOfSuperWithConstructor() {
		
		super("Hello");// compiler adds it by default
		System.out.println("I am a child class constructor");
	}
}