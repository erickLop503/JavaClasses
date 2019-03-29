package com.class13;

public class ReviewOfArrays {

	public static void main(String[] args) {

//		int [][] arr= {{1,2},{3,4},{5,6}};
//		int sum = 0;
//		
//		for (int i=0; i<arr[0].length; i++){
//			
//			System.out.println(arr[2][i]);
//			sum+= arr[2][i];
//		}
//		System.out.println(sum);

		// Write a program to print the length of each array.
//		int[][] array = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7, 8 } };
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("The lentgth of row " + (i + 1) + "= " + array[i].length);
//		}
//
//		for (int[] inner : array) {
//			System.out.println("The lentgth of row " + "= " + inner.length);
//
//		}
//
//		for (int[] inn : array) {
//			for (int elements : inn) {
//				System.out.print(elements + " ");
//			}

		// }

		System.out.println("---------------------------------------------------------");
//      Write a program to find the average of row 2.
//     2 6 9 3 7
//     1 7 9 4 8
//     0 4 6 2 5
//     0 1 2 3
		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

		double sum=0;
		double average;
		
		for (int i=0; i<rating[1].length; i++) {
			System.out.println(rating[1]);
			sum+=rating [1][i];
		}
		average=sum/5;
		System.out.println(average);

		int count = 0;

		for (int[] inner : rating) {
			for (int element : inner) {
				if (element >= 7) {
					count++;
				}
			}
		}
		System.out.println("The number of all elements above 7 are " + count);
	}
}
