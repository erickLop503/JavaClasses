package com.class17_2;

import com.class17.Calculator;


public class Application1 {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		System.out.println(obj.sum(5, 10));
		System.out.println(obj.mult(5, 7));
		System.out.println(obj.sub(20, 10));
		System.out.println(obj.div(50, 10));

	}
}
