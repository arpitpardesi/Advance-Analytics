package com.zensar.day8.junit;

public class TestWithoutJunit {

	public static void main(String[] args) {
		
		int result = Calculation.findMax(new int[] { -6,-4,-9,-1 });
		System.out.println(result);
		if(result == -1) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
	}
}
