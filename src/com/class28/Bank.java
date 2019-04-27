package com.class28;

public interface Bank {

	static String name="Bank";//by default all variables inside the interFace are public static final
	//by default compiler adds public & abstract every method
	String hello="hi";//by default it will be public static final

	void hasChecking();

	void hasSavings();

	void hasCreditCard();
	
	//static void hasLoan(); cannot have static abstract 
}

class BOA implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("Bank of America has 2 checking account");
	}

	@Override
	public void hasSavings() {
		System.out.println("Bank of America has 2 savings account");

	}

	@Override
	public void hasCreditCard() {
		System.out.println("Bank of America has 10 different credit card");

	}

}

class PNC implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking account");

	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings account");

	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different credit cards");

	}

}