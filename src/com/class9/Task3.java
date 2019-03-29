package com.class9;

public class Task3 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=1; i<=4; i++ ) {
			for (int y=4; y>=i; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
