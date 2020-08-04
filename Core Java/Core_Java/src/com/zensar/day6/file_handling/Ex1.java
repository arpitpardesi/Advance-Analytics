package com.zensar.day6.file_handling;

import java.io.File;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		File file = new File("Zen_File.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println(file.exists());
		
	}
}
