package com.zensar.day5.exceptions;

public class NotEligibleToVoteException extends Exception {

	public NotEligibleToVoteException() {
		super("You are not eligible to vote");		
	}
	public NotEligibleToVoteException(String mess) {
		super(mess);
	}
}
