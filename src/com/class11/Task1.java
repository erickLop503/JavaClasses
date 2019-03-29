package com.class11;

public class Task1 {

	public static void main(String[] args) {
		
		String [][] names = new String [2][4];
		
		//row 1 
		names [0][0]="Mr"; 
		names [0][1]="Mrs";
		names [0][2]="Ms";
		names [0][3]="Miss";
		
		//row2
		names [1][0]="Smith";
		names [1][1]="Jordan";
		names [1][2]="Jackson";
		names [1][3]="Obama";
		
		 System.out.println(names[0][1]+" "+names[1][0]);//Mrs Smith
		 System.out.println(names[0][0]+" "+names[1][3]);//Mr Obama
		 System.out.println(names[0][2]+" "+names[1][2]);//Ms Jackson
		 System.out.println(names[0][3]+" "+names[1][1]);//Miss Jordan
		 
		 
		 String [][] grades = { {"Erick", "Dan", "Kathy", "Tavon"}, {"grade A", "grade B", "grade C", "grade D"} };
		 
		 System.out.println(grades[0][0]+" "+grades[1][3]);
		 System.out.println(grades[0][2]+" "+grades[1][0]);
		 System.out.println(grades[0][1]+" "+grades[1][1]);
		 System.out.println(grades[0][3]+" "+grades[1][2]);
		 
	}
}
