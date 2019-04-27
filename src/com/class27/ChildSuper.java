package com.class27;

 class MainSuper {
	
	String name="burger";
    boolean lettuce=true;
    char grade='F';
    
    MainSuper(){
        System.out.println("a parent with no parameter ");

    }
    MainSuper(String a) {

        System.out.println("a parent with one parameter " + a);
    }

    MainSuper(String a, String b) {

        System.out.println("a parent with 2 parameters " + b);
    }



}

public class ChildSuper extends MainSuper {
    
    String name="boy";
    boolean lettuce=false;
    char grade='A';

    void print() {
        System.out.println(super.name+" "+super.lettuce+" "+super.grade);
        System.out.println(name+" "+lettuce+" "+grade);

    }
    ChildSuper(String a) {
        super(a);
        System.out.println("a child with 1 parameter " + a);
    }

    ChildSuper(String a, String b) {
        //super(a, b);
        System.out.println("a child with 1 parameter " + b);
    }
    public static void main(String[] args) {

        ChildSuper obj = new ChildSuper("hello", "bye");
        System.out.println("--------------------------------");
        obj.print();
        //ChildSuper obj1 = new ChildSuper("yes");
    }
    

}
