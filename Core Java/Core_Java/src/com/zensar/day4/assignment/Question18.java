package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question18 {

	public static void main(String[] args) {
		ArrayList<String> number1 = new ArrayList<String>();
		number1.add("1");
        number1.add("2");
        number1.add("3");
        number1.add("4");
        number1.add("5");
        System.out.println("Empty: "+number1.isEmpty());
        
        number1.removeAll(number1);
        System.out.println("Empty: "+number1.isEmpty());
        
        
	}
}
