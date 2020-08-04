package com.zensar.assignment_18july.linkedlist;

// Add at first and last in a linked list

import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {
		LinkedList<String> listOfCities = new LinkedList<String>();
		listOfCities.add("Mhow");
		listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        listOfCities.add("Indore");
        System.out.println("First: "+listOfCities.getFirst());
        System.out.println("Last : "+listOfCities.getLast());
	}
}
