package com.zensar.day3.interfaces;

public class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Bhow bhow..");
		
	}

	@Override
	public void sleep() {
		System.out.println("zzz...");
		
	}

}
