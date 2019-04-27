package com.class27;

public class Hello1 {

	 Hello1(String a){
	        this("hello","bye");
	        System.out.println("This is the value of a: "+a);
	    }
	    Hello1(String a, String b){
	        this("First","Second","Third");
	        System.out.println("This is the value of b: "+b);
	    }
	    Hello1(String a, String b, String c){
	        System.out.println("This is the value of c: "+c);
	    }

	    public static void main(String[] args) {
	        Hello1 obj= new Hello1("A");
	    }
}
