package com.class11;

public class Task {

	public static void main(String[] args) {

		/*
		 * Create an array of cars and
		 */

		String[] cars = { "Honda", "Toyota", "BMW", "Nissan", "Acura", "Ford" };

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		for (String barca : cars) {
			System.out.println(barca);
		}

		System.out.println("------------------------------------------------------");

		// Create an array of countries. While retrieving all values from an array print
		// capital
		// for each country (Use two different loops)

		String[] countries = { "El Salvador", "Honduras", "USA", "Mexico" };

		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("USA")) {
				System.out.println("D.C.");
			} else if (countries[i].equals("El Salvador")) {
				System.out.println("San Salvador");
			} else if (countries[i].equals("Honduras")) {
				System.out.println("Tegusigalpa");
			} else if (countries[i].equals("Mexico")) {
				System.out.println("D.F.");
			}

		}

		String[] countries1 = { "Argentina", "Brazil", "Colombia", "Uruguay", "Chile", "Venezuela" };

		for (String country : countries1) {

			switch (country) {

			case "Argentina":
				System.out.println("Buenos Aires");
				break;
			case "Brazil":
				System.out.println("Brasilia");
				break;
			case "Colombia":
				System.out.println("Bogota");
				break;
			case "Uruguay":
				System.out.println("Montevideo");
				break;
			case "Chile":
				System.out.println("Santiago");
				break;
			case "Venezuela":
				System.out.println("Caracas");
				break;
			}

		}

	}
}
