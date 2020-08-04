package com.zensar.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class Ex2_emp {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/analytics_batch";
		String userName = "root";
		String password = "admin";
		
		try {
			Class.forName(driverClassName);
			
			Connection con = DriverManager.getConnection(url,userName,password);
			
			PreparedStatement pst = con.prepareStatement("insert into employee values (?,?,?,?)");
			
			pst.setInt(1, 59128);
	        pst.setString(2, "Arpit Pardesi");
	        pst.setInt(3, 22);
	        pst.setString(4, "Project Trainee");
			
	        
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
