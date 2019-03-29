package com.class12;

public class StringManipulation {

	public static void main(String[] args) {
		
		//length
		String str = "Syntax";
		
		int lengthOfString = str.length();
		
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);
		
		
		String str2="Welcome, Students!";
		System.out.println(str2.length());
		
		//toUpperCase()-> Convert all characters toUpperCase
		//toLowerCase()-> Convert all characters toLowerCase

		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//equals () compares 2 String , if String are equal-> true, else -> false
		String str4="Hello";
		String str5="hello";
		
		boolean equality=str4.equals(str5);
        System.out.println(equality);
        
        
        String expectedBrowser="Chrome";
        String actualBrowser="chrome";
        
        boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
        System.out.println(equals);

	}
}
