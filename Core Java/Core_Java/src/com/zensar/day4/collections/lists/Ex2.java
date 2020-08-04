package com.zensar.day4.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {

		List<String> listOfCities = new ArrayList<String>();
        listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        
        Ex2 ex2 = new Ex2();
        

        ex2.displayListOfCities(listOfCities);
        
    }
    
    public void displayListOfCities(List<String> listOfCities) {
    	System.out.println("Size: "+listOfCities.size());
        for(String city:listOfCities) {
            System.out.println(city);
        }
    }
}
