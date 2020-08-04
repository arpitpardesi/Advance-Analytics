package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question20 {

	public static void main(String[] args) {
		ArrayList<String> number1 = new ArrayList<String>(5);
		number1.add("1");
        number1.add("2");
        number1.add("3");
        number1.add("4");
        number1.add("5");
        System.out.println("List: "+number1);
        
        number1.ensureCapacity(10);
        number1.add("6");
        number1.add("7");
        number1.add("8");
        number1.add("9");
        number1.add("10");
        System.out.println("New List: "+number1);
        
        
	}
}
