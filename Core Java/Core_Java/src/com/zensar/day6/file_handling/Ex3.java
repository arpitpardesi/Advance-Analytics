package com.zensar.day6.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//read file
public class Ex3 {

	public static void main(String[] args) {
		File file = new File("Zen_File.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String s = 	sc.nextLine();
				System.out.println(s);
			}
		    sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
