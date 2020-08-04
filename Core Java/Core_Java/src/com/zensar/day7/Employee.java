package com.zensar.day7;

public class Employee {

	private int empId;
	private String empName;
	private int age;
	private String empDesig;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int age,String empDesig) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age=age;
		this.empDesig = empDesig;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", empDesig=" + empDesig + "]";
	}
	
	
}
