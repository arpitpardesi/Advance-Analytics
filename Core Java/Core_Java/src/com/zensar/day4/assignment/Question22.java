package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question22 {

	public static void main(String[] args) {
		ArrayList<String> number1 = new ArrayList<String>();
		number1.add("1");
        number1.add("2");
        number1.add("3");
        number1.add("4");
        number1.add("5");
        number1.add("6");
        number1.add("7");
        number1.add("8");
        number1.add("9");
        number1.add("10");

        displayByIndex(number1);
        
        
	}

	private static void displayByIndex(ArrayList<String> number1) {
		// TODO Auto-generated method stub
		for(int i=0; i<number1.size();i++) {
        	System.out.println(number1.get(i));
        }
		
	}
}
