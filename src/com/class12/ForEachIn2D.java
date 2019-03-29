package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		
		/*
		 * Create a grocery List: fruits{}
		 *                        veggies{}
		 *                        dairy{}
		 *                        
		 */
		
		
		String [][] groceries= {
				{"Grapes", "Apples", "Oranges", "Bananas"},
				{"Cucumber","Tomatoes", "Carrots", "Onions"},
				{"Milk", "Cheese", "eggs", "Sourcream"},
		};
		
		for (int i=0; i<groceries.length; i++) {
			for (int l=0; l<groceries[i].length; l++) {
				System.out.print(groceries[i][l]+" ");
			}
			System.out.println();
		}
	
	System.out.println("-------------------------------------------");
		for (String [] list:groceries) {
			for(String items:list) {
				System.out.print(items+" ");
			}
		System.out.println();
		}
	
	
	
	}

}
