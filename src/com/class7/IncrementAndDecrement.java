package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//Post increment & Postdecrement 
		//a++;         a--;
		int x=10;
		int y=x;
		System.out.println(x+""+y);
		// post increment a++;
		
		
		int a=299;
		int b=a++; //first assign --> increment (int b=a; a=a+1)
		
		System.out.println(a);//300
		System.out.println(b);//299
		
		//post decrement x--;
		
		int z=10;
		int c=z--;
		
		System.out.println("This is the value of c is "+c);
		System.out.println("This is the value of z is "+z);
		
	}

}
