package com.zensar.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

/*
 *   Step1: Load the JDBC Driver class
        
     Step2: Create Connection object using Drivermanager class
        
     Step3: create a PreparedStatement object using the Connection created in step2, and supply sql query
        
     Step4: execute the query and collect the result
 */

public class Ex1 {

	public static void main(String[] args) {
		
		 String driverClassName = "com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://localhost:3306/analytics_batch";
		 String userName = "root";
		 String password = "admin";
		 
		 try {
			Class.forName(driverClassName);
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			System.out.println(con);
			
			PreparedStatement pst = con.prepareStatement("insert into product values (?,?,?)");
	        pst.setInt(1, 4);
	        pst.setString(2, "Alienware");
	        pst.setInt(3, 160000);
			
	        pst.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
