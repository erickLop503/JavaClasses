package com.class15;

public class Mainn {
	
	Mainn (String label, int price, String category, boolean hasExpiration,int stock){
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	Mainn (String str, String str1, int a, String str2,boolean no,int b){
		System.out.println(str+" "+str1+" "+a+" "+str2+" "+no+" "+b);
	}
	
	public static void main(String[] args) {
		
		Mainn groceries = new Mainn("Eggs",3,"Produce",true,10);
		Mainn groceries1 = new Mainn("Paper","Towels",2,"misc",false,24);

	}
}