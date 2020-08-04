package com.zensar.day2.classes;

public class ex3 {
	
	 public static void main(String[] args) {
	        Employee employee1 = new Employee();
	        System.out.println(employee1);
	        
	        System.out.println("******************");
	        
	        Employee employee2 = new Employee(1000, "John", "Programmer");
	        System.out.println(employee2);
	        System.out.println("******************");
	        employee2.setEmployeeName("David"); 
	        System.out.println(employee2);
	    }
	        
	}

