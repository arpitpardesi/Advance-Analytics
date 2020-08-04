package com.zensar.day5.exceptions;

public class Ex1 {

	public static void main(String[] args) {
		int num = 1;
		int den = 0;
		
		try {
			int a = num / den;
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot be divided by zero : "+e);
		}
		finally {
			System.out.println("Finally....");
		}
		
		
		
		
		
		
	}
}
