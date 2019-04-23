package com.class26;

public class Phone {

	public void makeCall() {
		System.out.println("can make a phone call");
	}
	
	public void hasCamera() {
		System.out.println("Phone has camera");
	}
}

class iPhone extends Phone{
	
	public void makeCall() {
		System.out.println("can make a phone call");
	}
	
	public void hasCamera() {
		System.out.println("iPhone has camera HD");
	}
	
}

class Nokia  extends Phone{
	
	public void makeCall() {
		System.out.println("can make a phone call");
	}
	
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
	
} 

class Samsung extends Phone{
	
	public void hasCamera() {
		System.out.println("Andori phone has 3 lenses camera ");
	}
	
}



