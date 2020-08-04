package com.zensar.day5.assignment.question2;

public class PriceTooLowException extends Exception {

	public PriceTooLowException() {
		super();
	}
	
	public PriceTooLowException(int price) {
		super("Price too low...");
	}
}
