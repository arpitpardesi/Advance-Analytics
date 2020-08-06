package com.zensar.day5.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Student> set = new HashSet<Student>();

		Student student1 = new Student(1, "A", "CS");
		Student student2 = new Student(2, "B", "EC");
		Student student3 = new Student(3, "C", "CS");
		Student student4 = new Student(4, "D", "IT");
		Student student5 = new Student(5, "E", "CS");

		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);
		display(set);
		System.out.println("-------------------------------------------");
		displayStudentHavingCourse("CS", set);

	}

	public static void displayStudentHavingCourse(String c, Set<Student> set) {
		// TODO Auto-generated method stub
		for (Student s : set) {
			if (s.getCourse().contains(c)) {
				System.out.println(s);
			}
		}

	}

	private static void display(Set<Student> set) {
		// TODO Auto-generated method stub
		for (Student s : set) {
			System.out.println(s);
		}

	}

}