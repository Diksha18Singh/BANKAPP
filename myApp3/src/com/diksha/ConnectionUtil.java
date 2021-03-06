package com.diksha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionUtil {
	
	public static Connection getConnection() {
		String driver = "org.apache.derby.jdbc.ClientDriver";
		String url = "jdbc:derby://localhost:1527/sample";
		String user = "user";
		String pass = "pass";

		return getConnection(driver, url, user, pass);
	}

	public static Connection getConnection(String driver, String url, String user, String pass) {
		try {
			Class.forName(driver);

		} catch (ClassNotFoundException ex) {
			System.out.println("No JDBC Driver Found");
			return null;
		}
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Established connection with" + con.getMetaData().getDatabaseProductName());
			return con;
		} catch (SQLException e) {
			System.out.println("Unable to connect" + e.getMessage());
			return null;
		}
	}


}
