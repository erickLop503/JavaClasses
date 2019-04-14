package com.class22;

public class TestSyntaxStudent {

	public static void main(String[] args) {
		
//		SyntaxStudent student1 = new SyntaxStudent();
//		student1.schoolName="Erick";
//		student1.studentLastName="Lopez";
//		
//		student1.getStudentsDetails();
//		
//		SyntaxStudent student2 = new SyntaxStudent();
//		student2.schoolName="Jacob";
//		student2.studentLastName="Prada";
//		
//		student2.getStudentsDetails();
		
		SyntaxStudent student1 = new SyntaxStudent("Erick","Lopez");
		student1.getStudentsDetails();
		
		SyntaxStudent student2 = new SyntaxStudent("Jacob","Prada");
		student2.getStudentsDetails();
	}
}
