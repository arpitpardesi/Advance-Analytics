package com.zensar.day5.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
	public static void main(String[] args) {
		String city1 = "Mhow";
		String city2 = "Indore";
		String city3 = "Pune";

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, city1);
		map.put(2, city2);
		map.put(3, city3);
		
		display(map);

	}

	private static void display(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		
		for(Integer i: map.keySet()) {
			System.out.println("Key: "+i+" Value: "+map.get(i));
		}
		
	}

}
