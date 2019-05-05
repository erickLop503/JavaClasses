package com.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {

public static void main(String[] args) {
        
        List<Integer> numbers=new ArrayList<>();
        for(int i=1; i<=50; i++) {
            if(i%2==0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        
        for(int j=2; j<=50; j++) {
            numbers.add(j);
        }
        Iterator<Integer> it=numbers.iterator();
        while(it.hasNext()) {
            int num=it.next();
            if(num%5==0) {
                it.remove();
            }
        }
        System.out.println(numbers);    
    }
}
