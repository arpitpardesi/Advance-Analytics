package com.zensar.day5.exceptions;

public class Ex3 {

	public static void main(String[] args) {
		int age = 10;
	
		try {
			check(age);
		} 
		
		catch (NotEligibleToVoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}	
	}

	public static void check(int age) throws NotEligibleToVoteException {
		// TODO Auto-generated method stub
		if(age >= 18) {
			
		}
		else {
			throw new NotEligibleToVoteException();
		}
	}
	
}
