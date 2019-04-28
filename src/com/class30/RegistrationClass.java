package com.class30;

/*
 * 3. Create Registration Class in which you would have variables as email, 
 * userName and password that have an access scope only within its own class. 
 * After creating an object of the class user should be able to call methods 
 * and in each method separately pass values to set users email, 
 * username and password.
Requirements:
Valid email consider to be only gmail
Valid userName and password cannot be empty
 */
public class RegistrationClass {

	private String email;
	private String userName;
	private String password;

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {
		if (email.contains("gmail")) {
			this.email = email;
		} else {
			System.out.println("Please provide only gmail");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {

		if (!userName.isEmpty()) {
			if (userName.length() > 6) {
				this.userName = userName;

			} else {
				System.out.println("UserName should be more then 6 characters");
			}
		} else {
			System.out.println("User name cannot be empty");
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;

				} else {
					System.out.println("Password cannot contain userName");
				}
			} else {
				System.out.println("Password cannot be empty");
			}
		} else {
			System.out.println("Password should be more than 6 characters");

		}
	}
}
