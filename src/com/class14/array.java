package com.class14;

public class array {

	public static void main(String[] args) {

		int arr[] = { 14, 46, 0, 100, 86, 92, -1 };

		int minimum = arr[0];
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		System.out.println("Minimum number is:" + minimum);
		System.out.println("2nd largest number is:" + secondLargest);
		System.out.println("Largest number is:" + largest);

	}
}
