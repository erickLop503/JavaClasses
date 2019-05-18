package com.class35;

public class UnCheckedException {

	public static void main(String[] args) {

		int[] array= {12,23,12};
		//System.out.println(array[3]);//ArrayIndexOutOfBoundsException
		
		String a="Hello";
		//System.out.println(a.charAt(5));//StringIndexOutOfBoundsException
		
		new ArrayIndexOutOfBoundsException();
		
		String str=null;
		System.out.println(str.length());//NullPointerException
	}

}
