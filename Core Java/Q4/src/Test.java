import java.util.Scanner;

class Employee{
	private int employeeId;
	private String employeeName;
	private int salary;
	private int age;  
	
	public void setID(int employeeId) {
		this.employeeId=employeeId;
	}
	public void setName(String employeeName) {
		this.employeeName=employeeName;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getID() {
        return employeeId;
    }
	
	public String getName() {
        return employeeName;
    }
	
	public int getSalary() {
        return salary;
    }
	
	public int getAge() {
        return age;
    }
	
	Employee(){
		System.out.println("Default Constructor"); 
	}
	
	Employee(int employeeId, String employeeName, int salary, int age)
    { 
        this.employeeName = employeeName; 
        this.employeeId = employeeId; 
        this.salary = salary; 
        this.age = age; 
    } 
	
}

public class Test {
	public static void main(String args[]) {
		
		
		
	}

}
