package com.zensar.day5.assignment.question3;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
		Map<Integer, Train> mapOfTrains = new HashMap<Integer, Train>();
		
		Train train1 = new Train(1,"Mhow-Indore","Mhow","Indore");
		Train train2 = new Train(2,"Jaipur Express","Indore","Jaipur");
		
		mapOfTrains.put(1, train1);
		mapOfTrains.put(2, train2);
		
		display(mapOfTrains);
	}

	private static void display(Map<Integer, Train> mapOfTrains) {
		// TODO Auto-generated method stub
		for(Integer t : mapOfTrains.keySet()) {
			System.out.println(mapOfTrains.get(t));
		}
	}

}
