package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 =>grade=A if the average score >= 70 and <90 => grade=B if
		 * the average score>=50 and <70 =>grade=C if the average score<50 =>grade=F
		 */
	
	
		Scanner sc;
		
		int quiz;
		int midTerm;
		int finalScore;
		
		sc=new Scanner(System.in);
		
		System.out.println("Please enter your quiz");
	    quiz = sc.nextInt();
	    
	    System.out.println("Please enter your midTerm");
	    midTerm = sc.nextInt();
	    
	    System.out.println("Please enter your finalScore");
	    finalScore = sc.nextInt();
	    
	    double averageScore = quiz+midTerm+finalScore/3;
	    
	    if (averageScore >90) {
	    	System.out.println("Grade = A");
	    }else if (averageScore >= 70 && averageScore <90) {
	    	System.out.println("Grade = B");
	    } else if (averageScore >=50 && averageScore <70) {
	    	System.out.println("Grade = C");
	    } else if (averageScore < 50) {
	    	System.out.println("Grade = F");
	    } else {
	    	System.out.println("Study More ");
	    }
	
	}

}
