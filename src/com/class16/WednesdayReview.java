package com.class16;

import java.util.Scanner;

public class WednesdayReview {

	String eyes;
	String hair;
	String nose;
	String shirt;
	String r = "seigolonhceT xatnyS";

	public static void main(String[] args) {

		WednesdayReview obj = new WednesdayReview();
//		obj.eyes="blue";
//		obj.hair="balck";
//		obj.nose="big";
//		obj.shirt="gray";
//		obj.noReturn();
//		System.out.println(obj.eyes);
//		
//		WednesdayReview obj1 = new WednesdayReview();
//		obj1.eyes="green";

//		obj.scannerFirstName();
//		obj.noReturn();
//		obj.scannerInt();
		obj.reverseString();
		obj.vowelCountLoop();
		obj.vowelCountReplaceAll();

	}

	void humanEyes() {
		System.out.println("red");
	}

	void noReturn() {
		System.out.println("I do not have a return type");
	}

	void scannerFirstName() {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	void scannerInt() {
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
	}

	void reverseString() {
		String str = "seigolonhceT xatnyS";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}

	void vowelCountLoop() {
		String str = "hello world my name Is wEqas";

		char[] strChar = str.toCharArray();
		char empty;
		for (int i = 0; i <= strChar.length - 1; i++) {
			if (strChar[i] == 'a' || strChar[i] == 'A' || strChar[i] == 'e' || strChar[i] == 'E' || strChar[i] == 'i'
					|| strChar[i] == 'I' || strChar[i] == 'o' || strChar[i] == 'O' || strChar[i] == 'u'
					|| strChar[i] == 'U') {

				empty = strChar[i];
				System.out.print(empty + ",");
			}

		}

	}

	void vowelCountReplaceAll() {
		String str = "hello world my name Is wEqas";
		String replace = str.replaceAll("[^aA,eE,iI,oO,uU]", "");
		System.out.println(replace);

	}
}
