package com.class9;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			//System.out.println("---------I am outer loop------ " + i);

			for (int k = 0; k < 3; k++) {
            System.out.println("I am inside loop " + k);
			
			}
			System.out.println("---------I am outer loop------ " + i);

		}
	}

}
