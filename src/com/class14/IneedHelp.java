package com.class14;

public class IneedHelp {

	// Print out the position of the first occurrence of "c"
	// Print out the position of the first occurrence of " "
	// Print out the position of the first occurrence of the variable target1
	// Print out the position of the first occurrence of the variable target2

	public static void main(String[] args) {
//		String str = "abracadabra alakazam";
//		String target1 = "dab";
//		String target2 = "ABRA";

		String str = "laptops out for harambe";

		/*
		 * Output 1: print str starting at index 5 and going to the end Output 
		 * 2: print str starting at index 7 and ending at index 10 Output 
		 * 3: print "harambe" this must not be a new string must be from str Output 
		 * 4: print "t f" this must not be a new string must be from str on one line
		 */
		
		System.out.println(str.substring(5));
        System.out.println(str.substring(7, 10));
        System.out.println(str.substring(16));
        System.out.println(str.substring(11, 13));
	}
}
