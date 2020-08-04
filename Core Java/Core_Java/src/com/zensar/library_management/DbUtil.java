package com.zensar.library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	public static Connection getMySqlDbConnection() {
		
		String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/analytics_batch";
        String userName = "root";
        String password = "admin";
		
        Connection con = null;
        
        try {
			Class.forName(driverClassName);
			
			con = DriverManager.getConnection(url,userName,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
        
		return con;
	}
}
