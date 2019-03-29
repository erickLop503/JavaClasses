package com.class12;

public class WednesdayReview {

	public static void main(String[] args) {
		
//      Write a program to find the average of row 2.
//     2 6 9 3 7
//     1 7 9 4 8
//     0 4 6 2 5
//     0 1 2 3
		int[][] rating = { { 2, 6, 9, 3, 7 }, 
				           { 1, 7, 9, 4, 8 }, 
				           { 0, 4, 6, 2, 5 }, 
				           { 0, 1, 2, 3 } };

		double sum=0;
		double average;
		
		for (int i=0; i<rating.length; i++) {
		
			sum+=rating[i][2];
		
		
		}
        System.out.println(sum/rating.length);
	}
}
