package com.class11;

public class RetrievingAllValues {

	public static void main(String[] args) {
		
		int [][] num = {
				{11, 12, 13, 14},
				{21, 22, 23},
				{31, 32, 33, 34}
		};
		
//		int rows=num.length;
//		System.out.println(rows);
//		
//		int cols=num[2].length;
//		System.out.println(cols);
		
		for (int row=0; row<num.length; row++) {
			
			for(int col=0; col<num[row].length; col++) {
				
				System.out.print(num[row][col]+" ");
			}
			    System.out.println();
		}
	
	
		String  [][] food = {
				{"burger", "fries", "hot dog", "meat loaf"},
				{"pupsas", "tamales", "riguas"},
				{"tortas", "tacos", "quesadillas", "burritos"}
		};
	
         for (int i=0; i<food.length; i++) {
			
			for(int j=0; j<food[i].length; j++) {
				
				System.out.print(food[i][j]+" ");
			}
			    System.out.println();
		}
	
	
	
	}
}
