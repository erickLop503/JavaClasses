package com.class9;

public class Pyrad {

	public static void main(String[] args) {

		

	    for (int a=1; a<=4; a++) {
	    	for (int b=1; b<=a; b++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	
	   
	    /*
	     *       ******
	     *       *    *
	     *       *    *
	     *       ******
	     */
	    
	    
	    
	    for ( int b=1; b<=4; b++) {
	    	
	    	for (int a=1; a<=6; a++) {
	    		
	    	
	    		if (b==1 || b==4 || a==1 || a==6) {
	    			System.out.print("*");
	    		
	    		} else {
	    			System.out.print(" ");
	    		}
	    		
	    	
	    	}
	    	
	    	
	    	
	    	System.out.println();
	    
	    
	    
	    }
	}

}
