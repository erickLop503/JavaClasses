package com.class9;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter the item they want to buy and the price for the item. Then
		 * ask user to pay for it. Every time user enters money accumulate the amount
		 * and tell user how much is left to pay off the amount. Whenever user done with
		 * payments tell them "Thank you for shopping!"
		 */

		Scanner scan;
		String item;
		double price;
		double payment;
		double totalPayment = 0;
		double balance;
		double change;

		scan = new Scanner(System.in);
		System.out.println("Please enter your item ");
		item = scan.nextLine();

		System.out.println("Please enter the item price ");
		price = scan.nextDouble();

		do {
			System.out.println("Please enter your payment amount ");
			payment = scan.nextDouble();

			totalPayment = totalPayment + payment;

			balance = price - totalPayment;

			if (totalPayment > price) {
				change = totalPayment - price;
				System.out.println("Please take your change " + change);
				break;

			} else if (totalPayment < price) {
				balance = price - totalPayment;
				System.out.println("Please enter more $" + balance);
				break;

			}

		} while (totalPayment != price);

		System.out.println("Thank you for shopping ");

//		double price, payment, change;
//		double sum = 0;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("What do you want to buy?");
//
//		String item = sc.nextLine();
//
//		System.out.println("Please enter the price of the item you want to buy");
//
//		price = sc.nextDouble();
//
//		do {
//			System.out.println("Please enter your payment");
//			payment = sc.nextDouble();
//			sum = sum + payment;
//
//		} while (sum < price);
//		System.out.println("Thank you for shopping");
//
//		if (sum > price) {
//			change = sum - price;
//			System.out.println("You overpayed, you are getting back " + change + "$");
//		} else {
//			System.out.println("Enjoy your purchase!");
//		}
	}
}
