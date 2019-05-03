package com.class32;

public class ArrayTest {

	public static void main(String[] args) {
		
		String a="A";
		String b=new String("B");
		
		int [] intArray= {10,21,34};
		String[] stringArray= {"Hello", "Bye"};
		
		//Can we place Object into array
		
		Visa visa1=new Visa("Visa Platinum");
		Visa visa2=new Visa("Visa Platinum");
		Visa visa3=new Visa("Visa Platinum");

		AX ax1=new AX("Visa Platinum");
		AX ax2=new AX("Visa Platinum");
		AX ax3=new AX("Visa Platinum");

		CreditCard[]visaArray= {visa1, visa2, visa3, ax1, ax2, ax3};
		//array of Objects
		Object[] objectArray= {visa1, visa1, "Erick", 61.2, 50};
		}
}
