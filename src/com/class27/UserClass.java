package com.class27;

public class UserClass {

	// 2. Write program: user class has a constructor that takes name and mobile
	// number. Extend this class by userInfo that will have user address variable.
	// Print users name, mobile number and address in userDetails method. Test your
	// code. (edited)

	public String name;
	public long mobileNumber;

	public UserClass(String name, long mobilNumber) {

		this.name = name;
		this.mobileNumber = mobilNumber;
	}

//	public UserClass() {
//		
//	}
}

class UserInfo extends UserClass {

	String address;

	public UserInfo(String name, long mobileNumber, String address) {
		super(name, mobileNumber);
		this.address = address;
	}

	public void userDtails() {
		System.out.println(
				"User name is " + super.name + " and mobile number is " + mobileNumber + " and address is " + address);
	}
}
