package com.zensar.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao2 {

	public void addProduct1(int product_id, String product_name, int price) {
        // using PreparedStatement
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into product values(?,?,?)";
		try {
			
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, product_id);
	        pst.setString(2, product_name);
	        pst.setInt(3, price);
	        			
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
