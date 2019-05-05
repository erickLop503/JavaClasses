package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList();
        drinks.add("soda");
        drinks.add("juice");
        drinks.add("milk");
        drinks.add("alcohol");
        drinks.add("water");
        
        Iterator<String> it=drinks.iterator();
        for(int i=0; i<drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
