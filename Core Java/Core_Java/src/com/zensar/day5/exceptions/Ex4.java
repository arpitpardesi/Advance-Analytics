package com.zensar.day5.exceptions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();

		Student student1 = new Student(1, "A", "CS",12);
		Student student2 = new Student(2, "B", "EC",16);
		Student student3 = new Student(3, "C", "CS",18);
		Student student4 = new Student(4, "D", "IT",23);
		Student student5 = new Student(5, "E", "CS",22);

		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);
		try {
			display(set);
		} catch (NotEligibleToVoteException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}

	private static void display(Set<Student> set) throws NotEligibleToVoteException {
		// TODO Auto-generated method stub
		for (Student s : set) {
					
			if(s.getAge()<18) {
				throw new NotEligibleToVoteException();
			}
			else {
				System.out.println(s);
			}
			
		}

	}

}
