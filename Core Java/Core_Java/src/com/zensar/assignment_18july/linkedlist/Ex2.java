package com.zensar.assignment_18july.linkedlist;

// Add at first and last in a linked list

import java.util.LinkedList;

public class Ex2 {

	public static void main(String[] args) {
		LinkedList<String> listOfCities = new LinkedList<String>();
        listOfCities.add("Pune");
        listOfCities.add("Mumbai");
        listOfCities.add("Delhi");
        System.out.println(listOfCities);
        System.out.println("----------------------------------");
        listOfCities.addFirst("Mhow");
        listOfCities.addLast("Indore");
        System.out.println(listOfCities);
	}
}
