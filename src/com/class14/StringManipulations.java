package com.class14;

public class StringManipulations {

	public static void main(String[] args) {

		// 1 Replace -> will replace old char/value with new char/value.

		String str = "I am good tester#1!";
		String newString = str.replace("a", "e");
		System.out.println(newString);
		
		String newString1=str.replace("good", "grate");
		System.out.println(newString1);
		
		//what we are looking to replace, new value
		String newString2=str.replace("tester", "programmer");
		System.out.println(newString2);
		
		String newString3=str.replace("Tester", "programmer");
		System.out.println(newString3);
		
        str=str.replace("!", "?");
        System.out.println(str);
        
        str=str.replace("1", "2");
        System.out.println(str);
        
        
        
        //2replaceAll() -> will replaced all that matches specified pattern[regex];
        
        String str1="12Hello 3234 World 465%+$@";
        String replacedNoNUmbers = str1.replaceAll("[0-9]", "");
        System.out.println(replacedNoNUmbers);
        
        String String11 =str1.replaceAll("[^A-Z a-z]", "");
        System.out.println(String11);
        
//        String replacedNoCharacter = replacedNoNUmbers.replaceAll("[A-Z a-z]", "");
//        System.out.println(replacedNoCharacter);

        String str2="1Hello47483";
		System.out.println(str2.replaceAll("[^0-9]", ""));
        
		
		
	}
}
