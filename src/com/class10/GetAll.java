package com.class10;

public class GetAll {

	public static void main(String[] args) {
		
		String [] names= {"Wilson", "Kathy", "John", "Talgat", "Tavo", "Messi", "Leo"};
		
		int a=3;
		
		System.out.println(names[a]);
		
		a+=2;
		
		System.out.println(names[a]);
		
		a-=4;
		
		System.out.println(names[a]);
		
		
		
		int size=names.length;
		 
		System.out.println(size);
		
		for (int i=0; i<size; i++) {
			System.out.println(names[i]);
		}
	}
}
