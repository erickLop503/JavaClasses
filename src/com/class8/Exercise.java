package com.class8;

public class Exercise {
	public static void main(String[] args) {

		//1. numbers from to 1 to 100
		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
		}

		//2. numbers from 100 to 1
		for (int e = 100; e >= 1; e--) {

			System.out.println(e);
		}

		//3. odd numbers from 1 to 20
		for (int h = 1; h <= 20; h +=2) {

			System.out.println(h);
		}

		
		//4. even numbers from 20 to 1
		for (int h =20; h >= 1; h -= 2) {

			System.out.println(h);
		}

		//5. even numbers between 20 and 50
		for (int q=20; q<=50; q+=2) {
			
			System.out.println(q);
		}
	
		for (int q=20; q<=50; q++) {
			if (q%2==0) {
				System.out.println(q);
			}
		}
		
		//6. odd numbers between 20 and 50
		for (int k=20; k<=50; k=k+2) {
			
			System.out.println(k);
		}
	
		for (int k=20; k<=50; k++) {
			if (k%2==1) {
				System.out.println(k);
			}
		}
	
		//7. even numbers from 50 to 20
		
		for (int k=50; k>=20; k--) {
			if (k%2==0) {
				System.out.println(k);
			}
		}
	
	}
}
