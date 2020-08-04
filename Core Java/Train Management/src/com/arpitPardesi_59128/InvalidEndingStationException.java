package com.arpitPardesi_59128;

public class InvalidEndingStationException extends Exception {

	public InvalidEndingStationException() {
		System.out.println("Ending station is either blank or same as starting station");
	}
}
