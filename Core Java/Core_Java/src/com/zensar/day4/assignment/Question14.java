package com.zensar.day4.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question14 {

	public static void main(String[] args) {
        
		ArrayList<String> number1 = new ArrayList<String>();
		number1.add("1");
        number1.add("2");
        number1.add("3");
        number1.add("4");
        number1.add("5");
        
        System.out.println("Before swap: "+number1);
        Collections.swap(number1, 1, 4);
        System.out.println("After swap: "+number1);
	}
}
