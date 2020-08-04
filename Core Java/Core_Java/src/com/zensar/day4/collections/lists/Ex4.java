package com.zensar.day4.collections.lists;

//Updating particular index

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
	public static void main(String[] args) {

		List<String> listOfCities = new ArrayList<String>();
        listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        
        
        /*
        for(String city:listOfCities) {
            System.out.println(city);
        	}
        
        
        
        
        */
        
        listOfCities.set(0, "Mhow");
        System.out.println(listOfCities.subList(1, 2));
}
}
