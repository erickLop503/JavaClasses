package com.class11;

public class Task2 {

	public static void main(String[] args) {
		
		//Create an array of cars: american, german, japan, italian. then retrieve all values from that array
		
		String  [][] cars = {
				{"Ford", "Chevrolet", "Dodge", "GMC"},
				{"BMW", "Mercedez", "Audi"},
				{"Honda", "Toyota", "Nissan", "Lexus", "Subaru", "Mitsubishi"},
				{"Ferrari","Fiat", "Lamborginhi"}
		        };
	
         for (int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				
				System.out.print(cars[i][j]+" ");
			}
			    System.out.println();
		}
	
         String  [][] countries = {
 				{"Canada", "Usa", "Mexico"},
 				{"El Salvador", "Honduras", "Guatenala", "Nicaragua","Costa Rica"},
 				{"Argentina", "Brazil", "Colombia", "Venezuela", "Chile", "Uruguay", "Peru", "Ecuador"},
 				{"Spain","France", "Germany", "Italy", "England"},
 				{"South Africa", "Nigeria", "Morocco","Ghana", "Algeria", "Senegal"}
 		        };
 	
         int rows=countries.length;
 		System.out.println(rows);
 		
 		int cols=countries[2].length;
 		System.out.println(cols);
          
         
         for (int i=0; i<countries.length; i++) {
 			
 			for(int j=0; j<countries[i].length; j++) {
 				
 				System.out.print(countries[i][j]+" ");
 			}
 			    System.out.println();
 		}
		
		
		
		
		
		
		
		
		}
}
