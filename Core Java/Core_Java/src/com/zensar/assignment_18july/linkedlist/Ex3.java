package com.zensar.assignment_18july.linkedlist;

// Remove first and last in linked list

import java.util.LinkedList;

public class Ex3 {

	public static void main(String[] args) {
		LinkedList<String> listOfCities = new LinkedList<String>();
        listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        listOfCities.add("Mhow");
        listOfCities.add("Indore");
        System.out.println(listOfCities);
        System.out.println("----------------------------------");
        listOfCities.removeFirst();
        listOfCities.removeLast();
        System.out.println(listOfCities);
	}
}
