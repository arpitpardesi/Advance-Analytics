package com.zensar.day7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoImpl implements EmpDao {

	@Override
	public int addEmp(Employee employee) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();

		String sql = "insert into employee values (?,?,?,?)";

		int result = 0;
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getEmpName());
			pst.setInt(3, employee.getAge());
			pst.setString(4, employee.getEmpDesig());

			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteEmp(int empId) {
		// TODO Auto-generated method stub
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "delete from employee where emp_id = ?";

		int result = 0;

		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, empId);
			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public Employee getEmp(int empId) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select * from employee where emp_id=?";
		Employee employee = null;

		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, empId);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				String empName = rs.getString("emp_name");
				int age = rs.getInt("emp_age");
				String empDesig = rs.getString("emp_desig");
				employee = new Employee(empId, empName, age, empDesig);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return employee;
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub

		List<Employee> allEmp = new ArrayList<Employee>();
		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "select * from employee";

		try {

			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {

				int empId = rs.getInt("emp_id");
				String empName = rs.getString("emp_name");
				int age = rs.getInt("emp_age");
				String empDesig = rs.getString("emp_desig");

				Employee employee = new Employee(empId, empName, age, empDesig);
				allEmp.add(employee);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return allEmp;
	}

	@Override
	public int updateEmp(Employee employee) {
		// TODO Auto-generated method stub

		Connection con = DbUtil.getMySqlDbConnection();
		String sql = "update employee set emp_name = ? where emp_id = ?";

		int result = 0;
		
		try {
		
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(2, employee.getEmpId());
			pst.setString(1, employee.getEmpName());
			result = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
