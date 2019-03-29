package com.class11;

public class TwoDemantionsOfArrays {

	public static void main(String[] args) {
		
		int [][] numbers=new int [4][4];
		
		//With "new" key word 
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2 row
		numbers[1][0]=5;
		numbers[1][1]=6;
		numbers[1][2]=7;
		numbers[1][3]=8;
		
		//3 row
		numbers[2][0]=11;
		numbers[2][1]=12;
		numbers[2][2]=13;
		numbers[2][3]=14;
		
		//4 row
		numbers[3][0]=100;
		numbers[3][1]=200;
		numbers[3][2]=300;
		numbers[3][3]=400;
		
		System.out.println(numbers[2][0]);
		
		
		//WithOut "new" key word
		
		int [][] numbers1= { 
				{10, 20, 30, 40},
				{5, 6, 7, 8},
				{11, 12, 13, 14},
				{100, 200, 300, 400} };
		System.out.println(numbers1[3][2]);//300
		System.out.println(numbers1[1][1]);//6
		System.out.println("-------------------------------------------------");
		
		String [][] groups= {
				{"Erick", "Danny", "Jacob", "Kevin"},
				{"Jose", "Nelson", "Bryan", "Andy"}
		        };
		
		System.out.println(groups[0][0]);//Erick
		System.out.println(groups[1][2]);//bryan
		
	  }
	}

