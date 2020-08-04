package com.zensar.day4.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question10 {

	public static void main(String[] args) {
		
		ArrayList<String> number = new ArrayList<String>();
		
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
		
        System.out.println("Before: "+number);
        System.out.println("------------------------------------------");
		Collections.shuffle(number);
		
        System.out.println("After: "+number);
	}
}
