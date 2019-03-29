package com.class6;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {

		Scanner scan;
		String favoriteFood;
		String country;

		scan = new Scanner(System.in);

		System.out.println("Please enter your country");

		country = scan.nextLine();

		switch (country) {

		case "USA":
			favoriteFood = "Burger";
			break;
		case "Afghanistan":
			favoriteFood = "Palau";
			break;
		case "Russia":
			favoriteFood = "Pelmeni";
			break;
		case "Italy":
			favoriteFood = "Pasta";
			break;
		case "Turkey":
			favoriteFood = "Baklava";
			break;
		case "Morocco":
			favoriteFood = "Couscous";
			break;
		case "Kazakhstan":
			favoriteFood = "Beshparmak";
			break;
		case "Pakistan":
			favoriteFood = "Biryani";
			break;
		default:
			favoriteFood = "Unknown";
		}
		System.out.println("Your favorite food is " + favoriteFood);
	}

}
