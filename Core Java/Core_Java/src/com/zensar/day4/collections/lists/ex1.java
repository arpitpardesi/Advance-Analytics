package com.zensar.day4.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
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
        
        System.out.println(listOfCities.get(0));
}
}
