package com.class16;

public class Computer {

	boolean mouse, keyBoard;
	int screen, ram;
	String os, brand;
	
	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		computer1.mouse=true;
		computer1.keyBoard=true;
		computer1.screen=2;
		computer1.ram=8;
		computer1.os="Windows";
		computer1.brand="HP";
		
		//define behaviour
		computer1.watchMovie();
		computer1.doJavaCoding();
		computer1.playMusic();
		
		System.out.println("----------object 2-----------------------");
		
		Computer computer2 = new Computer();
		computer2.mouse=false;
		computer2.keyBoard=false;
		computer2.screen=4;
		computer2.ram=6;
		computer2.os="Mac Os";
		computer2.brand="Apple";
		
		//define behaviour
		computer2.watchMovie();
		computer2.doJavaCoding();
		computer2.playMusic();
	}
	
	void watchMovie() {
		System.out.println("We can watch movies on a computer "+brand);
	}
	
	void doJavaCoding() {
		System.out.println("We can do java coding on our computer "+brand);
	}
	
	void playMusic() {
		System.out.println("We can play music on our computer "+brand);
	}
}
