package com.class30;

public class CollectionsConcept {

	public static void main(String[] args) {

		
		// one variable stores one value
		
				int a=10;
				int b=20;
				int c=30;
				
				// array store multiple values
				
				int []array = {10, 20, 30, 40};
				
				int[] intArray=new int[3];//size of array
				intArray[0]=10;
				intArray[1]=20;
				intArray[2]=30;
//				array1[3]=17;
//				array1[4]=11;
			
		        //how to retrieve all values from the array
				
				for (int i=0; i<intArray.length; i++) {
					
				
				System.out.println(intArray[i]);
			
				}
				
				for (int number:intArray) {
					System.out.println(number);
				}
	}
}
