package com.zensar.day8;

import java.util.List;

import org.junit.Test;

import com.zensar.day7.EmpDao;
import com.zensar.day7.EmpDaoImpl;
import com.zensar.day7.Employee;

import junit.framework.Assert;

public class TestEmpDao {

	EmpDao empDao = new EmpDaoImpl();
	Employee employee = new Employee();
	
	/*
	public static void main(String[] args) {
		EmpDao empDao = new EmpDaoImpl();

		testAddEmp(new Employee(4, "GHI", 22, "Tester"), empDao);
		testDelEmp(4, empDao);
		testGetEmp(2, empDao);
		testGetAllEmp(empDao);
		testUpdateEmp(new Employee(3, "GHI", 22, "Tester"), empDao);
	}
*/
	@Test
	public void testAddEmp() {

		int result = empDao.addEmp(new Employee(3, "GHI", 22, "Tester"));
		if (result == 0) {
			System.out.println("Addition Failed");
		} else {
			System.out.println("Addition Successful");
		}
		Assert.assertEquals(1, result);
	}

	@Test
	public void testDelEmp() {
		int empId = 4;
		int result = empDao.deleteEmp(empId);
		if (result == 0) {
			System.out.println("Deletion Failed");
		} else {
			System.out.println("Deletion Successful");
		}
		Assert.assertEquals(1, result);
	}

	@Test
	public void testGetEmp() {
		int empId = 1;
		Employee employee = empDao.getEmp(empId);
		System.out.println(employee);
		Assert.assertNotNull(employee);
	}

	@Test
	public void testGetAllEmp() {
		List<Employee> allEmp = empDao.getAllEmp();
		System.out.println(allEmp);
		Assert.assertNotNull(allEmp);
	}
	@Test
	public void testUpdateEmp() {
		int result = empDao.updateEmp(new Employee(1, "ABC", 22, "Trainee"));
		if (result == 0) {
			System.out.println("Updation Failed");
		} else {
			System.out.println("Updation Successful");
		}
		Assert.assertEquals(1, result);
		
	}

}
