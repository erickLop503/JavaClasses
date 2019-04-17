package com.class24;

public class Testing1 {

public static void main(String[] args) {
		
		Parent parent= new Parent();
		parent.love();
		parent.work();
		
		Child child = new Child();
		child.cry();
		child.love();
		child.work();
		
		//type casting
		Parent obj= new Child();
		//Child obj1= new Parent();not possible
		obj.love();
		obj.work();
		//obj.cry();not accessible
	}
}
