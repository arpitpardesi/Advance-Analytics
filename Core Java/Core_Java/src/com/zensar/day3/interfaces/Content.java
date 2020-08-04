package com.zensar.day3.interfaces;

public class Content implements Netflix {

	@Override
	public void contentType() {
		System.out.println("Content Type: Movie");
		
	}

	@Override
	public void genre() {
		System.out.println("Genre: Horror");
		
	}

	

}
