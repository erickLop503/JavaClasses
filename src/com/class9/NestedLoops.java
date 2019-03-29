package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int a=1; a<5; a++) {
			
			for (int b=1; b<6; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	
	//I want to print the pattern
		/*
		 * 1111111
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 */
		
		for (int l=1; l<=7; l++) {
			
			for (int k=1; k<7; k++) {
				System.out.print(l);
			}
					System.out.println();
				
					}
	
		for (int o=0; o<4; o++) {
			for (int m=0; m<5; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		for ( int n=5; n>1; n--) {
			for (int g=5; g>0; g--) {
				System.out.print(g);
			}
			System.out.println();
		}
	
		for ( int n=5; n>0; n--) {
			for (int g=5; g>0; g--) {
				System.out.print(n);
			}
			System.out.println();
		}
	
	    for (int a=1; a<=4; a++) {
	    	for (int b=1; b<=a; b++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	
	
	
	}
}
