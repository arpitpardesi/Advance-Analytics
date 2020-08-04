package com.zensar.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDao {
	
	public void getEmployee(int productId) {
		Connection con = getMySqlDbConnection();
		String sql = "select * from employee where emp_id=?";
		try {
			
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, productId);        			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next())
		      {
		        int id = rs.getInt("emp_id");
		        String name = rs.getString("emp_name");
		        String des = rs.getString("emp_desig");
		       
		        System.out.println("Emp ID: "+id);
		        System.out.println("Name: "+name);
		        System.out.format("Designation: "+des);
		      }
			
			//System.out.println(rs.getInt("product_id"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
    }
	
	public void deleteEmp(int empId) {
        // delete product with the given id
		Connection con = getMySqlDbConnection();
		String sql = "delete from employee where emp_id=?";
		try {
			
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, empId);
	        
	        			
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
    }

	public void addEmp(int emp_id, String emp_name, int emp_age, String emp_des) {
		Connection con = getMySqlDbConnection();
		
		String sql = "insert into employee values("+emp_id+",'"+emp_name+"',"+emp_age+", '"+emp_des+"')";
		System.out.println(sql);
        try {
        	
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public void addEmp1(int emp_id, String emp_name, int emp_age, String emp_des) {
        // using PreparedStatement
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into employee values(?,?,?,?)";
		try {
			
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, emp_id);
	        pst.setString(2, emp_name);
	        pst.setInt(3, emp_age);
	        pst.setString(4, emp_des);
	        			
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
	
	
	 public Connection getMySqlDbConnection() {
	        String driverClassName = "com.mysql.jdbc.Driver";
	        String url = "jdbc:mysql://localhost:3306/analytics_batch";
	        String userName = "root";
	        String password = "admin";
	        
	        // Step1: Load the JDBC Driver class
	        Connection con = null;
	        try {
	            Class.forName(driverClassName);
	        
	        
	        // Step2: Create Connection object using Drivermanager class
	         con = DriverManager.getConnection(url, userName, password);
	        System.out.println("Connection is:"+con);
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	        
	        return con;
	    }
}
