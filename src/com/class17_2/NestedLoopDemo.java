package com.class17_2;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		NestedLoopDemo demo = new NestedLoopDemo();
		demo.printNumbers();

	}
	
	void printNumbers() {
		for (int i=1; i<=2; i++) {
			
			for (int j=0; j<=3; j++) {
				
				System.out.println(i+ " " +j);
			}
		}
	}
}
