package com.class30;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer integer1=new Integer(10);//Boxing
		System.out.println(integer1);
		Integer integer2=10;//Autoboxing
		
		int num=integer1.intValue();//unBoxing
		System.out.println(num);
		
		System.out.println(integer2);
	}
}
