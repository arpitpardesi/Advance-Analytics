package com.zensar.day2.classes;

public class test5 {
	
	public static void main(String[] args) {
	    Employee employee1 = new Employee(1001, "Pawan", "Programmer");
	    Employee employee2 = new Employee(1002, "Avinash", "Manager");
	    Employee employee3 = new Employee(1003, "Udit", "Tester");
	   
	    Employee[] employeeArray = {employee1, employee2, employee3};
	   
	    // write for loop and logic to print only name of employee whose name starts with a vowel
	    for (int i=0 ; i < employeeArray.length; i++) {
	    	
	    	char ch = employeeArray[i].getEmployeeName().charAt(0);
	    	
	    	if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
	    	   ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
	    	   ch=='u' || ch=='U'){
	    		
		    	System.out.println(employeeArray[i].getEmployeeName());

	         }
	    	
	    	/*
	    	if(employeeArray[i].getEmployeeName().startsWith("P")) {
	         	System.out.println(employeeArray[i].getEmployeeName());

	    	}
	        */
	    }
	}

}
