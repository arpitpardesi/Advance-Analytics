package com.zensar.assignment_18july.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
	
	public static void main(String[] args) {
		
		List<String> listOfCities = new ArrayList<String>();
        listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        listOfCities.add("Indore");
        listOfCities.add("Mhow");

        display(listOfCities);
	}

	private static void display(List<String> listOfCities) {
		// TODO Auto-generated method stub
		Iterator<String> it = listOfCities.iterator();
        while(it.hasNext()) {
        
        	System.out.println("City: "+it.next());
        }
        
		
	}

}
