package com.zensar.day6.jdbc;

public class TestEmp {

	public static void main(String[] args) {
		
		EmpDao dao = new EmpDao();
		//dao.addEmp(1,"ABC",22,"Trainee");
		//dao.addEmp1(2, "DEF", 22,"Trainee");
		//dao.deleteEmp(4);
		dao.getEmployee(2);
	}
}
