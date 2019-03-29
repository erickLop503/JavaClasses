package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {
		
		String str="Good Morning, students!";
		boolean contains=str.contains("students");
		System.out.println(contains);
		
		
		String present = "Welcome, Erick";
		String neededValue="WELCOME,";
		
	    boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);
		
		
		//startWith(), endWith 
		System.out.println("-----------StartWith and EndWith--------------");
		String str1="syntax";
		
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		System.out.println(str1.endsWith("x"));
		
		//
		System.out.println("-----------isEmpty------------");
		
		String str2="";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		
		//Concat() will concatenate 1 Sting to end of another
		System.out.println("---------- Concat---------");
		String str3 = "Hello ";
		String str4 = "Erick!";
		
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//Trim() will remove spaces at the 
		System.out.println("___________----__________");
		String expected="You may qualify for a multi-policy dicount!";
		String actual="    You may qualify for a multi-policy dicount!      ";
		
		actual=actual.trim();
		System.out.println(expected.equals(actual));
		
	}
}
