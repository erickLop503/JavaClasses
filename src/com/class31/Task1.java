package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	 public static void main(String[] args) {
	        ArrayList<String> cars=new ArrayList<String>();
	        cars.add("Honda");
	        cars.add("Toyota");
	        cars.add("Nissan");
	        //for loop
	        System.out.println("------For Loop------");
	        for(int i=0; i<cars.size(); i++) {
	            System.out.println(cars.get(i));
	        }
	        //enhanced for loop
	        System.out.println("------Enhanced For Loop------");
	        for(Object s:cars) {
	            System.out.println(s);
	        }
	        //Iterator
	        System.out.println("------Iterator------");
	        Iterator<String> it=cars.iterator();
	        while(it.hasNext()) {
	            String i=it.next();
	            System.out.println(i);
	        }
	        //While loop
	        System.out.println("------While Loop------");
	        int a=0;
	        while(cars.size()>a) {
	            String my=cars.get(a);
	            System.out.println(my);
	            a++;
	        }    
	    }
}
