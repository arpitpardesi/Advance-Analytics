package com.zensar.day7;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static Connection getMySqlDbConnection() {
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
