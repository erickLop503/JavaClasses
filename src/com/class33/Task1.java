package com.class33;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create a map of countries with its capital. Print all keys and values from a
		 * country map using for each loop and iterator. Print all values from a country
		 * map using for each loop and iterator.
		 */

		
		Map <String, String> map=new LinkedHashMap<>();
		map.put("El Salvador", "San Salvador");
		map.put("Honduras", "Tegusigalpa");
		map.put("USA", "Washington");
		map.put("Spain", "Barcelona");
		map.put("Argentina", "Buenos Aires");

		
		Set <String> country=map.keySet();
	    for (String s:country) {
	        System.out.println("Country "+s+" and capital city is "+map.get(s));
	    }
		
	    System.out.println("-----------------------");
	    Iterator<String> itCountry=country.iterator();
	    while  (itCountry.hasNext()) {
	        String c=itCountry.next();
	        System.out.println("Country "+c+" has capital city "+map.get(c));
	    }
		
	    System.out.println("--------All values---------------");
	    Collection<String> val=map.values();
	    for(String values:val) {
	    	System.out.println(values);
	    }
	}
}
