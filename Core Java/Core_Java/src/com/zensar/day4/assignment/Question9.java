package com.zensar.day4.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Black");
		color.add("Cyan");
		
        ArrayList<String> colorName = new ArrayList<String>();
		
        colorName.add("R");
        colorName.add("G");
        colorName.add("B");
        colorName.add("Bl");
        colorName.add("C");
		
        System.out.println("List1: "+color);
        System.out.println("List2: "+colorName);
        System.out.println("------------------------------------------");
		Collections.copy(color, colorName);
		
		System.out.println("List1: "+color);
        System.out.println("List2: "+colorName);
		
	}
/*
	private static void displayColor(ArrayList<String> color) {
		// TODO Auto-generated method stub
		for(String c:color) {
			System.out.println(c);
		}
	}	
*/
}
