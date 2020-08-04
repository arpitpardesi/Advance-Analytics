package com.zensar.day7;

import java.util.List;

public interface EmpDao {

    public int addEmp(Employee employee);
	
    public int deleteEmp(int EmpID);
    
    public Employee getEmp(int EmpID);

    public List<Employee> getAllEmp();
    
    public int updateEmp(Employee employee);
}
