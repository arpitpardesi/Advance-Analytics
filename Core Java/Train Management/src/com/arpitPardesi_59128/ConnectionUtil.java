package com.arpitPardesi_59128;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	public static Connection getConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/analytics_batch";
		String userName = "root";
		String passWord = "admin";

		Connection con = null;

		try {

			Class.forName(driverClassName);

			con = DriverManager.getConnection(url, userName, passWord);

			System.out.println("Connection is:" + con);

		} catch (Exception e) {

			System.out.println(e);
		}

		return con;
	}

}
