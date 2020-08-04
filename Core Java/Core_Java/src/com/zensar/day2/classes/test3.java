package com.zensar.day2.classes;
// Array of employee


public class test3 {
	
	Employee emp1 = new Employee(28, "AD", "D.S.");
	Employee emp2 = new Employee(30, "AP", "DS");
	Employee emp3 = new Employee(00, "ABC", "DS");
	
	Employee[] employeeArray =  {emp1, emp2, emp3};
	
	for(String e: employeeArray){
		System.out.println(e);
	}

	
	
}
}
