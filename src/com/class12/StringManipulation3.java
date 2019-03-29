package com.class12;

public class StringManipulation3 {

	public static void main(String[] args) {

		String str = "Students";

//		char character=str.charAt(7);
//		System.out.println(character);
//		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + ",");
		}
		System.out.println();

		// indexOf returns an index of specified character
		System.out.println("---------indexOf---------");
		String str1 = "Sunday";
		int index = str1.indexOf("a");
		System.out.println(index);

		String str2 = "Syntax Technologies";
		System.out.println(str2.indexOf("Syntax"));
		System.out.println(str2.indexOf("Technologies"));
		System.out.println(str2.indexOf(" "));
		System.out.println(str2.indexOf("w"));

		//subString()  gives 
		System.out.println("-------Sub String  --------");

		String str3 = "Today is Sunday Java class";
		String newString = str3.substring(2);
        System.out.println(newString);
        
        System.out.println(str3.substring(0, 5));//Today
        System.out.println(str3.substring(9, 20));//Sunday Java
        System.out.println(str3.substring(16, 20));//Java
        System.out.println(str3.substring(21));
	}
}
