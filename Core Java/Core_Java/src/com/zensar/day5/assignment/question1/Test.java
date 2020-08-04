package com.zensar.day5.assignment.question1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1, "A", 1000000, 20);
		Employee emp2 = new Employee(2, "B", 100000, 22);
		Employee emp3 = new Employee(3, "C", 500000, 66);
		Employee emp4 = new Employee(4, "D", 200000, 22);
		Employee emp5 = new Employee(5, "E", 2000000, 12);
			
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		display(employees);
		
		
	}

	private static void display(List<Employee> employees) {
		// TODO Auto-generated method stub
		for(Employee e : employees) {
			if(e.getAge() >= 18 && e.getAge() <= 60) {
				System.out.println(e);	
			}
			else {
				try {
					throw new AgeNotValidException(e.getAge());
				} catch (AgeNotValidException e1) {
					// TODO Auto-generated catch block
					System.out.println(e1);
				}
			}
		}
		
	}

}
