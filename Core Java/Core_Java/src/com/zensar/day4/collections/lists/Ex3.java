package com.zensar.day4.collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		List<String> listOfCities = new ArrayList<String>();
        listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        
        Ex3 ex2 = new Ex3();
        

        ex2.displayListOfCities(listOfCities);
        String city;
        Scanner sc = new Scanner(System.in);
        city= sc.nextLine();
		ex2.deleteCity(city, listOfCities);
        
    }
    
    public void displayListOfCities(List<String> listOfCities) {
    	System.out.println("Size: "+listOfCities.size());
        for(String city:listOfCities) {
            System.out.println(city);
        }
    }
    
    public void deleteCity(String city, List<String> listOfCities) {
    	
    	listOfCities.remove(city);
    	for(String c:listOfCities) {
            System.out.println(c);
        }
    }
}
