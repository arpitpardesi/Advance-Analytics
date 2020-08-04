package com.zensar.day4.collections.lists;

import java.util.ArrayList;
import java.util.List;



public class Ex7 {
	public static void main(String[] args) {
		
		List<Employee> listOfEmp = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"ABC","Trainee");
		Employee e2 = new Employee(2,"DEF","Trainee");
		Employee e3 = new Employee(3,"GHI","Trainee");
	
		
		listOfEmp.add(e3);
		listOfEmp.add(e3);
		listOfEmp.add(e3);
		
		display(listOfEmp);
		
		//System.out.println(listOfEmp);
	}

	private static void display(List<Employee> listOfEmp) {
		// TODO Auto-generated method stub
		for(Employee a : listOfEmp) {
			System.out.println(a);
		}
		
	}

}
