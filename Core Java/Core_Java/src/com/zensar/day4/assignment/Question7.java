package com.zensar.day4.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add(2, "Black");
		color.add(0, "Cyan");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Color name: ");
		String c = scanner.next(); 
				
		System.out.println("After changing");
		if(color.contains(c)) {
			System.out.println("List has "+c);
		}
		else {
			System.out.println("It does not contain "+c);
		}
	
		
	}

}
