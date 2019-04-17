package com.class24;

public class Bank {

	//Parent class
	public int chargeInterest() {
		return 0;
	}
}

    //Child class
	class BOA extends Bank{
		@Override //annotation
		public int chargeInterest() {
			return 2;
		}
	}
	
	//Child2 class
	class PNC extends Bank{
		@Override //annotation
		public int chargeInterest() {
			return 3;
		}
}
