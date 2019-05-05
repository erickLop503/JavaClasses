package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("hello");
        words.add("bye");
        words.add("hi");
        words.add("handsome");
        
        Iterator<String> it=words.iterator();
        while(it.hasNext()) {
            String name=it.next();
            if(name.endsWith("e")) {
                it.remove();
            }    
        }
        System.out.println(words);    
    }
}
