package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		
		int a=1;
		
		while (a<10) {
			System.out.println("Good Morning");
		    a++;
		}
	
		int b=0;
		
		while (b<5) {
			System.out.println("I am inside the while loop"+b);
		    b++;
		}
	
	        System.out.println("I am outside the while loop");
	        
	        //I want to print values from 10 to 20;
	        
	    int z=10;
	    
	    while (z<=20) {
	    	System.out.println(z);
	        z++;
	    }
	   
	    int q=1;
	    
	    while (q<=20) {
	    	System.out.print(q + " ");
	        q++;
	    }
	
	    //I want to print values from 10 to 1
	    
	    int e=10;
	    
	    while (e>=1) {
	    	System.out.println(e);
	    	e--;
	    }
	}

}
