package com.zensar.library_management;

public class BookNotAvailableException extends Exception{
	
	public BookNotAvailableException() {
		System.out.println("Book you are trying to get is currently not available");
	}
}
