package com.zensar.day5.exceptions;

public class Ex2 {
	public static void main(String[] args){
		int age = 10;
		
		try {
			checkEligibility(age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Should be more than 18");
		}
		
		
	}

	private static void checkEligibility(int age) throws Exception {
		// TODO Auto-generated method stub
		if(age < 18) {
			throw new Exception("Not elligible");
		}
		
		System.out.println("Age is "+age);
	}

}
