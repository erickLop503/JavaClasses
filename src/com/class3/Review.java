package com.class3;

public class Review {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		String a="hello";
		String b="bye";
		
		System.out.println(x+y+a+b);
		System.out.println(x+a+y+b);
		System.out.println(x+a+b+y);
		System.out.println(a+b+x+y);
		System.out.println(a+b+(y+x));
		
		
		int c=10;
		int d=3;
		int div=c/d;
	
		System.out.println(div);
		
		//modulus operator
		
		int mod=c%d;
		System.out.println(mod);
		
		int q=101;
		int w=10;
		System.out.println(q%w);
		
		//Parentheses, Exponents, Multiplication/Division, Modulus,Addition/Subtraction
		int e= -5+4*6;
		System.out.println(e);
		
		int j=(22+9) % 7;
		System.out.println(j);
		
		int o = 20 + -3*5 / 8;
        System.out.println(o);//28; 27; 19; 18;
        
        int z= 5 + 15 / 3 * 2 - 8 % 3; //(5+10-2)
        System.out.println(z);//17; 5; 13
		
	}

}
