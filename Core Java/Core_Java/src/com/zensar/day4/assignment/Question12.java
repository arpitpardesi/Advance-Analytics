package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question12 {

	public static void main(String[] args) {
		
		ArrayList<String> number = new ArrayList<String>();
		
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
		
        System.out.println("String: "+number);
        System.out.println("Sub String: "+number.subList(2, 6));
        
	}
}
