package com.zensar.day5.assignment.question1;

public class AgeNotValidException extends Exception {

	
	
	public AgeNotValidException(int age) {
		super("Employee age is less than 18 years or more than 60 years");
	}
}
