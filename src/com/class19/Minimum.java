package com.class19;

public class Minimum {

	/*
	 * Create a class Called Minimum with in it crate a method called minOfValues
	 * make it static From your previous Applicaions class call the method and pass
	 * an array argument and prin out the result
	 */

	static int minValues(int[] x) {
		int min = 0;

		for (int y : x) {
			if (y < min) {
				min = y;
			}
		}
		return min;
	}

	//each for loop
	static int maxValues(int[] x) {

		int max = 0;

		for (int y : x) {
			if (y > max) {
				max = y;
			}
		}
		return max;

	}
	
	//for loop 
	static int maxOfValues(int[] array) {

        int max = array[0];

        for (int j = 0; j < array.length; j++) {

            if (array[j] >= max) {

                max = array[j];
            }

        }

        return max;

    }
}
