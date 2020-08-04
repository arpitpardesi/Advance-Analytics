package com.zensar.day4.user_input;

import java.util.Scanner;

public class ex1 {
	 
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");

		    String userName = sc.nextLine();  // Read user input
		    System.out.println("Username is: " + userName);  // Output user input
	
		    int id = sc.nextInt();
		    System.out.println("User ID: "+id);
		  }

}
