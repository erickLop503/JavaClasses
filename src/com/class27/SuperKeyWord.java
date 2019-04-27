package com.class27;


class ParentSuper{
    String Parent="parent";
    
    ParentSuper(){
        System.out.println("parent");
    }
    void hello() {
        System.out.println("hello world");
    }
    
} 


public class SuperKeyWord extends ParentSuper {

String Parent="Child";
    
    void hello() {
    super.hello();
    }
    
    SuperKeyWord(){
        super();
        System.out.println("child");

    }
    
    public static void main(String[] args) {
    	SuperKeyWord superKey=new SuperKeyWord();
        superKey.hello();
    }
}
