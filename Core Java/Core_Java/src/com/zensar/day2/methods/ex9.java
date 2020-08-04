package com.zensar.day2;

public class ex9 {
	
	public static void main(String[] args) {
		
		int b = factorial(5);
		System.out.println(b);
		
		
	}

	private static int factorial(int a) {
		if(a==0) {
			return 1;
		}
		else {
			return a * factorial(a-1);
		}
	}

}
