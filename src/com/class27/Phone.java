package com.class27;

public abstract class Phone {

	public void makeCall() {
		System.out.println("Phone can make calls");
	}

	public void sendText() {
		System.out.println("Phone can send text");
	}

	public abstract void unlockPhone();

	public abstract void viewPictures();

}

class iPhone extends Phone {// concrete class - is a class that is inherited from a abstract
							// class or implemented by interface and providing complete implementation of
							// all unimplemented /abstract class

	@Override
	public void unlockPhone() {
		System.out.println("To view pictures on Iphone can go to Images");
	}

	@Override
	public void viewPictures() {
		System.out.println("To unlock Iphone we can use FaceId or FingerPrint");
	}

}

class Samsung extends Phone {

	@Override
	public void unlockPhone() {
		System.out.println("To unlock samsung we neew to enter password");
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures we have to go to gallery");
	}

}