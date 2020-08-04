package com.zensar.day4.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex6 {
	public static void main(String[] args) {
		List<Integer> age = new ArrayList<Integer>();
		
	
		age.add(1);
		age.add(4);
		age.add(3);
		age.add(2);
		
		Collections.sort(age);
		
		for (int i : age) {
		      System.out.println(i);
		    }

		
		//System.out.println(age);
		
		//for(int i = 0)
	}

}
