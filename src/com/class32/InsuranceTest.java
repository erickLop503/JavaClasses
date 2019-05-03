package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTest {

	public static void main(String[] args) {
		
		Insurance obj=new CarInsurance("Geico","Honda");
		Insurance obj1=new PetInsurance("AllState","Dog");
		Insurance obj2=new HealthInsurance("Kaiser");
		
		List<Insurance> insList=new ArrayList<>();
		insList.add(obj);
		insList.add(obj1);
		insList.add(obj2);	
		
		//for loop
		for(int i=0; i<insList.size(); i++) {
			System.out.println(insList.get(i).insuranceName);
		}
		
		//Advance loop
		for (Insurance ins:insList) {
			ins.getQuote();
		}
		
		//iterator
				Iterator<Insurance> it=insList.iterator();
				while(it.hasNext()) {
					it.next().cancelInsurance();
				}
	}
}
