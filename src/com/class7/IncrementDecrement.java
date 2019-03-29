package com.class7;

public class IncrementDecrement {

	public static void main(String[] args) {

		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a;// Preincrement = first increment --> Assign
		
		System.out.println("Value of b is " + a);//11
		System.out.println("Value of a is " + b);//11
		
		int c=a++;
		int d=c++;// Postincrement = first Assign --> increment 
		
		System.out.println("Value of d is " + d);//10
		System.out.println("Value of c is " + c);//11
		
		int q=100;
		int e=q--;
		System.out.println("Value of h is " +e);
		System.out.println("Value of h is " +q);
		
		int h=50;
		int g=--h;
		System.out.println("Value of h is " + h);
		System.out.println("Value of g is " + g);
	}

}
