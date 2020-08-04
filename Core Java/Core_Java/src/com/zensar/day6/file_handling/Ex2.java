package com.zensar.day6.file_handling;
// write file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		
		try {
			FileWriter file = new FileWriter("Zen_File.txt");
			file.write("Java File Handling");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
