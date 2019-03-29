package com.class6;

public class m {

	public static void main(String[] args) {

//		int a=2;
//		
//		while (a<=13) {
//			System.out.println(a);
//			
//			a+=2;
//		}

		/*
		 * Write a java program to print "Hello Syntax Solutions how are you" three
		 * times using the while loop
		 * 
		 * Step 1: Initialize the value int i=1
		 * 
		 * Step 2: Write the while loop conditions and print the output
		 * "Hello Syntax Solutions how are you" three times
		 */

//		int i=1;
//		
//		while (i<=3) {
//			System.out.println("Hello Syntax Solutions how are you");
//			
//			i++;
//		}

		/*
		 * Print 1 to 10 Numbers except 7 ,8,9,5 using the While loop
		 * 
		 * Step 1: Initialize the i value as int i=1
		 * 
		 * Step 2: Create the while loop to check the condition
		 * 
		 * Step 3: Write the if condition for validation part
		 * 
		 * Step 4 : It should print 1 2 3 4 6 10
		 */

		int i = 1;

		while (i <= 10) {

			if (i==4) {
				i++;
				break;
				//System.out.println(i);
				
			}
			System.out.println(i);

		}

	}
}
