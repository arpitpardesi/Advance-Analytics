package com.zensar.day4.assignment;

import java.util.ArrayList;

public class Question16 {

	public static void main(String[] args) {
		ArrayList<String> number1 = new ArrayList<String>();
		number1.add("1");
        number1.add("2");
        number1.add("3");
        number1.add("4");
        number1.add("5");
        System.out.println("List1: "+number1);

        ArrayList<String> number2 = (ArrayList<String>)number1.clone();
        System.out.println("List2: "+number2);        
        
	}
}
