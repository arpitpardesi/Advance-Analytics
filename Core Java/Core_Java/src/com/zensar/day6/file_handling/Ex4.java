package com.zensar.day6.file_handling;

import java.io.File;

public class Ex4 {

	public static void main(String[] args) {
		File file = new File("Zen_File.txt");
		if(file.delete()) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not deleted");
		}
	}
}
