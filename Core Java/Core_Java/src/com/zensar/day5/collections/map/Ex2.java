package com.zensar.day5.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
	public static void main(String[] args) {
		
		Bank bank1 = new Bank(1, "SBI", "Mhow");
		Bank bank2 = new Bank(2, "ICICI", "Mhow");
		Bank bank3 = new Bank(3, "IDBI", "Mhow");
		Map<Integer, Bank> mapOfBank = new HashMap<Integer, Bank>();
		
		mapOfBank.put(1, bank1);
		mapOfBank.put(2, bank1);
		mapOfBank.put(3, bank1);
		display(mapOfBank);

	}

	private static void display(Map<Integer, Bank> mapOfBank) {
		// TODO Auto-generated method stub
		
		for(Integer i: mapOfBank.keySet()) {
			System.out.println("Value: "+mapOfBank.get(i));
		}
		
	}

}
