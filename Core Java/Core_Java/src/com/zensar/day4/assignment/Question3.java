package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add(2, "Black");
		color.add(0, "Cyan");
		
		displayColor(color);
		
	}

	private static void displayColor(ArrayList<String> color) {
		// TODO Auto-generated method stub
		for(String c:color) {
			System.out.println(c);
		}
	}	
}
