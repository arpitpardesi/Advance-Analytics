package com.zensar.day3.abstraction;

public class Content extends Netflix {

	@Override
	public void contentType() {
		System.out.println("Content Type: Web Series");
		
	}

	@Override
	public void genre() {
		System.out.println("Genre: Horror");
		
	}

}
