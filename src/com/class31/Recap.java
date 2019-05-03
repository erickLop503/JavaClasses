package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		int [] array= {10,10,30,40};
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(0, 13);
		numbers.add(0, 14);
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		
		System.out.println("------------for loop------------");
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("------------for each loop------------");

		for (int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println("------------Iterator------------");

		Iterator<Integer> it= numbers.iterator();
		//has.next(); next(); remove();		
		while(it.hasNext()) {
			int number=it.next();
			System.out.println(number);
		}
		
		System.out.println("------------while loop------------");

		//4 way using while loop
		int c=0;
		
		while (numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++;
		}
	}
}
