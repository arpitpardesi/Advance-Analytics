package com.zensar.day5.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
	public static void main(String[] args) {

		String state1 = "Maharashtra";
		String state2 = "MP";
		String state3 = "Delhi";
		String state4 = "Karnataka";
		String state5 = "Karnataka";
		Set<String> set = new HashSet<String>();

		set.add(state1);
		set.add(state2);
		set.add(state3);
		set.add(state4);
		set.add(state5);
		display(set);
		stateStartingWith("M", set);
	}

	private static void stateStartingWith(String c, Set<String> set) {
		// TODO Auto-generated method stub
		for (String s : set) {
			if (s.startsWith(c)) {
				System.out.println(s);
				break;
			}
		}

	}

	private static void display(Set<String> set) {
		// TODO Auto-generated method stub
		System.out.println("Size: " + set.size());

		for (String s : set) {
			System.out.println(s);
		}

	}

}
