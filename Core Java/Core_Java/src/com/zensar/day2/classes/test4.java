package com.zensar.day2.classes;
// Array of employee

public class test4 {
public static void main(String[] args) {
    Employee employee1 = new Employee(1001, "John", "Programmer");
    Employee employee2 = new Employee(1002, "David", "Manager");
    Employee employee3 = new Employee(1003, "Peter", "Tester");
   
    Employee[] employeeArray = {employee1, employee2, employee3};
   
    for (int i=0 ; i < employeeArray.length; i++) {
    	if(employeeArray[i].getEmployeeName().startsWith("P")) {
    		    	System.out.println(employeeArray[i].getEmployeeName());

    	}
    }
    // write for loop and logic to print only name of employee whose name starts with P
   
}
}