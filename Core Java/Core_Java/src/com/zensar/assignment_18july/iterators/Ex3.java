package com.zensar.assignment_18july.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		List<String> listOfCities = new ArrayList<String>();
		Iterator<String> it = listOfCities.iterator();
		listOfCities.add("Pune");
		listOfCities.add("Mumbai");
		listOfCities.add("Delhi");
		listOfCities.add("Indore");
		listOfCities.add("Mhow");
		display(listOfCities);
		System.out.println("--------------------------------------");
		displayRemove(listOfCities);
		display(listOfCities);

	}

	private static void displayRemove(List<String> listOfCities) {
		// TODO Auto-generated method stub
		Iterator<String> it = listOfCities.iterator();
		while (it.hasNext()) {
			String i = it.next();
			if (i.contains("Pune")) {
				it.remove();
			}
		}

	}

	private static void display(List<String> listOfCities) {
		// TODO Auto-generated method stub
		Iterator<String> it = listOfCities.iterator();
        while(it.hasNext()) {
        
        	System.out.println("City: "+it.next());
        }
        
		
	}

}
