package com.zensar.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex4_emp {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/analytics_batch";
		String userName = "root";
		String password = "admin";
		
		try {
			Class.forName(driverClassName);
			
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String sql = "insert into employee values (28, 'Anushka Dubey' , 22, 'Data Analyst')";


			Statement st = con.createStatement();
			
			
	        
	        st.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
