package com.class14;

public class StringSplit {

	public static void main(String[]  args) {

		String str="Welcome Syntax Students Batch 4";
		String[] array=str.split("S");
		System.out.println("The length of the array is "+array.length);
		
		for(String subString:array) {
			System.out.println(subString);
		}
		System.out.println("--------------------");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
