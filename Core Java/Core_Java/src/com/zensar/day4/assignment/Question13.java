package com.zensar.day4.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Question13 {


	public static void main(String[] args) {
		
		ArrayList<String> number1 = new ArrayList<String>();
		
        number1.add("1");
        number1.add("2");
        number1.add("3");
        number1.add("4");
        number1.add("5");
        
        ArrayList<String> number2 = new ArrayList<String>();
        number2.add("6");
        number2.add("7");
        number2.add("8");
        number2.add("9");
        number2.add("10");
        
        if(number1.equals(number2)) {
        	System.out.println("Same");
        }
        else {
        	System.out.println("Different");
        }
        
	}
}
