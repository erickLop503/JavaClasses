package com.class25;

public class TestPayment {

	public static void main(String[] args) {
		
		
		Payment parent = new Payment();
		parent.makePayment();
		
		MasterCard mc = new MasterCard();
		mc.makePayment();
		
		Visa visa = new Visa();
		visa.makePayment();
		visa.annualFee();
		
		//Achieving run time polymorphism
		//pay- reference variable, Payment-type
		//new MasterCard();- creating an object
		Payment pay=new MasterCard();
		pay.closePayment();
		pay.makePayment();
		
	}
}
