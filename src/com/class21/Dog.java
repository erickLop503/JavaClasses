package com.class21;

public class Dog {

	static String breed="Husky";
	static int paws=4;
	String name;
	int weigth;
	int heigth;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		Dog dog2=new Dog();
		Dog dog3=new Dog();
		
		dog1.name="Mardy";
		dog1.weigth=60;
		dog1.heigth=40;
		dog1.getDogPropeties();
		
		dog2.name="Waffle";
		dog2.weigth=100;
		dog2.heigth=90;
		dog2.getDogPropeties();

		breed="Pug";
		dog3.name="Lucy";
		dog3.weigth=20;
		dog3.heigth=30;
		dog3.getDogPropeties();
		
		dog1.getDogPropeties();
		dog2.getDogPropeties();
		System.out.println(breed);
		
		//3 ways to accessing 
		System.out.println(breed);
		System.out.println(Dog.breed);//by class
		System.out.println(dog3.breed);// by object reference--not preffered 

	}
	
	public void getDogPropeties() {
		System.out.println(name+" is breed of "+breed+" and weight is "+weigth+" and heigth is "+ heigth);
	}
}
