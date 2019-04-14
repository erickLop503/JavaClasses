package com.class15;

/*
Returns: a String
Method Name: makeThreeSubstr
Parameters:
a String called "word"
an integer called "startIndex"
an integer called "endIndex"
Then, starting on line 4, write code that will return 3x the substring 
(no spaces) from "startIndex" to "endIndex"
 * 
 */
public class Mainn {

	static String makeThreeSubstr(String word, int startIndex, int endIndex ) {
		
         for(int i=0; i<=word.length()-1; i++) {
        	 System.out.print(word.substring(0, 2));
         }

		return word;
		
	}
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}