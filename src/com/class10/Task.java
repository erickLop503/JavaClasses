package com.class10;

public class Task {

	public static void main(String[] args) {
		
		char [] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		char [] grades1=new char [6];
		grades1[0]='A'; 
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='E';
		grades1[5]='F';

		System.out.println(grades[1]);
		System.out.println(grades1[1]); 
		
		
		String [] names = {"Erick ", " Daniel", " Lopez", " Vallejo"};
		
		String[] names0=new String [4];
		
		names0[0]="Erick ";
		names0[1]=" Daniel";
		names0[2]=" Lopez";
		names0[3]=" Vallejo";
		
		System.out.println(names[0]+names[1]+names[2]+names[3]);
		System.out.println(names0[0]+names0[1]+names0[2]+names0[3]);
		
		
		String[] words= {"Java", "Saturday", "Day", "Coding", "Is"};
		
		String Sentence =(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
        System.out.println(Sentence);
        
        int size=words.length;
        
        System.out.println("This is the size of array = "+size);

	}
}
