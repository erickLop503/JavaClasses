package com.class12;

import java.util.Scanner;

public class PasswordAndUsserNameTask {

	public static void main(String[] args) {

		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * 1. Username and Password cannot be empty, if so→ message=”Username and
		 * Password cannot be empty”. 2. Password should be minimum 8 characters, if
		 * less → message=”Password is too short”. 3. Password cannot contain username
		 * if so, → message=”Password cannot contain username”. 4. Password should match
		 * confirmed password, if not → message “Passwords do not match”. 5. Only after
		 * all requirements met → message “Your username and password has been created”
		 */

		Scanner scan = new Scanner(System.in);

		String userName, password, confirmedPassword, massage;

		System.out.println("Please enter your UsserName");
		userName = scan.nextLine();

		System.out.println("Please enter your UsserName");
		password = scan.nextLine();

		System.out.println("Please Comfirm Password");
		confirmedPassword = scan.nextLine();

		if (!(userName.isEmpty() && password.isEmpty())) { // 1 checkpoint

			if (password.length() > 8) { // 2 checkpoint

				if (!password.contains(userName)) { // 3 checkpoint

					if (password.equals(confirmedPassword)) { // 4 checkpoint
						massage = "Your username and password has been created";

					} else {
						massage = "Passwords do not match";
					}

				} else {
					massage = "Password can not contain username";
				}

			} else {
				massage = "Password is too short";
			}
		} else {
			massage = "Please enter Username and password can not be empty";
		}

		System.out.println(massage);
	}
}
