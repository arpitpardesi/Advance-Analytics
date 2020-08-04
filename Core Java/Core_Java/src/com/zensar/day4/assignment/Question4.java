package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add(2, "Black");
		color.add(0, "Cyan");
		
		System.out.println(color.get(4));
		System.out.println(color.get(0));
		
	}
}
