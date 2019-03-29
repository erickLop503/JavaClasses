package com.class6;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {

		/*
		 * Prompt user with question: "Is it weekend?" if it is not a weekend -->
		 * subject="Manual testing" Otherwise --> subject="Java"
		 * 
		 * Output of the program should be: "Today you will be learning ____"
		 */

//		System.out.println("Is it weekend ?");
//	
//	    Scanner scan;
//	    boolean weekend ;
//	    String activity;
//	    
//	    scan = new Scanner (System.in);
//	    weekend = scan.nextBoolean();
//	    
//	    
//	    if (!weekend ) {
//	    	activity="Manual testing ";
//	    } else {
//	    	activity="Java";
//	    }
//	    System.out.println("Today you will be learning " + activity);

		/*
		 * Create a program that prompt user with question: Do you need a loan? If the
		 * result is true then prompt user with question: What is your credit score?
		 * Otherwise eligibility = "Unknown" Based on the score define users eligibility
		 * if score is below 600 --> eligibility = "Not eligible" if score is between
		 * 600 and 700 inclusive --> eligibility = "Maybe eligible" if score is between
		 * 701 and 800 inclusive --> eligibility = "Eligible" if score is higher than
		 * any other previous values --> eligibility = "Definitely eligible" .
		 * 
		 * The output of the program should be: "The eligibility is ____"
		 */

//		Scanner scan=new Scanner (System.in);
//        boolean result=true;
//        int score;
//       // score=scan.nextInt();
//        String eligibility=null;
//        
//       System.out.println("Do you need a loan?");
//       result=scan.nextBoolean();
//
//      if (result) {
//        System.out.println("What is your credit score?");
//        score=scan.nextInt();
//       if (score<600) {
//           eligibility="Not eligible";
//       }else if (score>=600 && score<=700) {
//        eligibility="Maybe eligible";
//      }else if (score>=701 && score<=800) {
//        eligibility="Eligible";
//      }else if (score>801) {
//        eligibility="Definitely eligible";
//      }
//      }else {
//        eligibility="Unknown";
// }
//      System.out.println("The eligibility is "+eligibility);

		/*
		 * 
		 * Prompt user to input two strings : "Please enter two strings" and two
		 * integers: "Please enter two numbers" and make the comparisons: if int1 and
		 * int2 are equal and word1 and word2 are equal, output "AND" if int1 and int2
		 * are equal or word1 and word2 are equal, output "OR" if int1 and int2 are not
		 * equal and word1 and word2 are not equal, output "NONE"
		 */
		
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Please enter two strings and two integers");
         
		 String str1, str2;
         str1=scan.nextLine();
         str2=scan.nextLine();
         
         int int1, int2;
         int1=scan.nextInt();
         int2=scan.nextInt();
         
         if (str1.equals(str2) && int1 == int2) {
        	 System.out.println("AND");
         } else if (str1.equals(str2) || int1 == int2) {
        	 System.out.println("OR");
         } else {
        	 System.out.println("NONE");
         }
         
         
         
	}

}
