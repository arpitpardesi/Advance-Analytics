package com.zensar.day7;

import java.util.List;

public class TestEmpDao {

	public static void main(String[] args) {
		EmpDao empDao = new EmpDaoImpl();

		testAddEmp(new Employee(4, "GHI", 22, "Tester"), empDao);
		testDelEmp(4, empDao);
		testGetEmp(2, empDao);
		testGetAllEmp(empDao);
		testUpdateEmp(new Employee(3, "GHI", 22, "Tester"), empDao);
	}

	public static void testAddEmp(Employee employee, EmpDao empDao) {

		int result = empDao.addEmp(employee);
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			System.out.println("Addition Successful");
		}
	}

	public static void testDelEmp(int empId, EmpDao empDao) {
		int result = empDao.deleteEmp(empId);
		if (result == 0) {
			System.out.println("Deletion Failed");
		} else {
			System.out.println("Deletion Successful");
		}
	}

	public static void testGetEmp(int empId, EmpDao empDao) {
		Employee employee = empDao.getEmp(empId);
		System.out.println(employee);
	}

	public static void testGetAllEmp(EmpDao empDao) {
		List<Employee> allEmp = empDao.getAllEmp();
		System.out.println(allEmp);
	}

	public static void testUpdateEmp(Employee employee, EmpDao empDao) {
		int result = empDao.updateEmp(employee);
		if (result == 0) {
			System.out.println("Updation Failed");
		} else {
			System.out.println("Updation Successful");
		}
	}

}
