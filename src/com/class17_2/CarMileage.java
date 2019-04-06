package com.class17_2;

public class CarMileage {

	public static void main(String[] args) {

		CarMileage obj = new CarMileage();
		obj.car();
		
	}

	void car() {
		for (int a = 0; a <= 9; a++) {

			for (int e = 0; e <= 9; e++) {

				for (int u = 0; u <= 9; u++) {

					for (int t = 0; t <= 9; t++) {

						System.out.println(a + "" + e + "" + u + "" + t);
					}
				}
			}
		}
	}
}
