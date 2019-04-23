package com.class26;

public class TestPhone {

	public static void main(String[] args) {
		
		Phone phone= new Phone();
		System.out.println("------Object of the Parent class-------");
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("------Object of the iPhone class-------");
		iPhone iphone=new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("-----Object of the Samsung class-----");
		Samsung samsung=new Samsung();
		samsung.makeCall();
		samsung.hasCamera();
		
		System.out.println("-------Object of the Nokia class------");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
	
	//This is polymorphism runTime
	System.out.println("-----Object of the Phone class refering to the parent----------");
		Phone p=new iPhone();
		p.makeCall();
		p.hasCamera();
		
		
		Phone p1=new Nokia();
		p1.makeCall();
		p1.hasCamera();
		//p1.cannotBreak();ce:method is undifined
		
		//crating a variable of ParentTYepe
		
		Phone parentPhone;
		
		//assigning iPhone object
		parentPhone=new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		//assigning Samsung object
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		//assigning Nokia object
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		
		
	
	
	}
}
