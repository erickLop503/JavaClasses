package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		//2 ways to create a String
		//1 way - using String literal
		
		String str="Hello";
		
		//2 Way
		
		String str1=new String("Bye");
		
		str.toUpperCase();
		str.replace("o", "a");
		
		System.out.println(str);
	}
}
