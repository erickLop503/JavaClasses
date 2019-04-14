package com.class22;

public class SyntaxStudent {

	/*
	 * school
	 * batchNumber
	 * studenName
	 * StudentLastName
	 * 
	 * method getStudentsDatails
	 */
	
	public static String schoolName="Syntax";
	public static int batchNumber=4;
	
	public String studentName;
	public String studentLastName;
	
	public SyntaxStudent(String name, String lName) {
		studentName=name;
		studentLastName=lName;
	}
	
	public void getStudentsDetails() {
		String details="I am a student at "+schoolName+" form batch"+batchNumber+" and my name is "+studentName+" "+studentLastName;
		System.out.println(details);
	}
}
