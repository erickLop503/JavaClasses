package com.class16;

public class Phone {

	String color;
	boolean expensive, old;
	int price;
	
	public static void main (String [] args) {
		
		System.out.println("------------iPhone------------");
		Phone iPhone = new Phone();
		iPhone.color="White";
		iPhone.expensive=true;
		iPhone.old=false;
		iPhone.price=1000;
		
		iPhone.text();
		iPhone.call();
		iPhone.playMusic();
		
		System.out.println("-------------Android--------------");
		Phone android = new Phone();
		android.color="Black";
		android.expensive=true;
		android.old=false;
		android.price=800;
		
		android.text();
		android.call();
		android.playMusic();
		
		System.out.println("----------Nokia---------------------------");
		Phone nokia = new Phone();
		nokia.color="Red";
		nokia.expensive=false;
		nokia.old=true;
		nokia.price=50;
		
		nokia.text();
		nokia.call();
		nokia.playMusic();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	void call() {
		System.out.println("I can make calls ");
	}
	
	void text() {
		System.out.println("I can text");
	}
	
	void playMusic() {
		System.out.println("I can play music");
	}
}
