package com.zensar.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {
	
	public void getProduct(int productId) {
		Connection con = getMySqlDbConnection();
		String sql = "select * from product where product_id=?";
		try {
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, productId);        			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next())
		      {
		        int id = rs.getInt("product_id");
		        String name = rs.getString("product_name");
		        int price = rs.getInt("price");
		       
		        
		        
		        System.out.format(id+" "+name+" "+price);
		      }
			
			//System.out.println(rs.getInt("product_id"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
    }
    
	
	public void deleteProduct(int productId) {
        // delete product with the given id
		Connection con = getMySqlDbConnection();
		String sql = "delete from product where product_id=?";
		try {
			
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setInt(1, productId);
	        
	        			
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
    }

	public void addProduct(int product_id, String product_name, int price) {
		Connection con = getMySqlDbConnection();
		
		String sql = "insert into product values("+product_id+",'"+product_name+"',"+price+")";
		System.out.println(sql);
        try {
        	
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            
            
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
	        //System.out.println("Connection is:"+con);
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	        
	        return con;
	    }
}
