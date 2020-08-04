package com.zensar.library_management;

public class PriceTooLowException extends Exception {

	public PriceTooLowException() {
		super("Price of the book you are trying to add is less than 100");
	}
}
