package com.class17_2;

public class Clock {

	         //24 hours //60 minutes
	
	public static void main(String[] args) {
		
		Clock obj = new Clock();
		obj.time();
	}
	
	void time() {
		
for (int hour=0; hour<24; hour++) {
			
			for( int min=0; min<60; min++) {
				
				if (min<10) {
					System.out.println(hour+ ":0" +min);
				} else {
					System.out.println(hour+ ":" +min);
				}
			}
		}
	}
}
