package com.zensar.day4.user_input;

import java.util.Scanner;

public class EX2 {
	public static void main(String[] args) {
		
		int empID;
		String empName, empDes;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee Name : "); 
		empName = sc.nextLine(); 
	    
		System.out.print("Emp ID: ");
	    empID = sc.nextInt();
	    
	    System.out.print("Emp Des: "); 
	    empDes = sc.nextLine();
	    
	    Employee employee = new Employee(empID, empName, empDes);
	    
	    System.out.println("Name: "+employee.getEmployeeName());
	    System.out.println("ID: "+employee.getEmployeeId());
	    System.out.println("Des: "+employee.getDesignation());
	}

}
