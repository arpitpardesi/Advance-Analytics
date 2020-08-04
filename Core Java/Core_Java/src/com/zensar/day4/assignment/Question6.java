package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add(2, "Black");
		color.add(0, "Cyan");
		
		System.out.println("Before removing	3rd element");
		displayColor(color);
		
		color.remove(2);
		System.out.println("After removing 3rd element");
		displayColor(color);
		
	}

	private static void displayColor(ArrayList<String> color) {
		// TODO Auto-generated method stub
		for(String c:color) {
			System.out.println(c);
		}
	}	
}
