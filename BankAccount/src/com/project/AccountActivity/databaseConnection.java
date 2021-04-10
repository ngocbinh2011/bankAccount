package com.project.AccountActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
	
	private static final String datebaseName = "bankaccount";
	private static final String url = "jdbc:mysql://localhost:3306/";
	private static final String username = "root";
	private static final String password = "20112001";
	
	public static Connection getConnectionToMysql() {
		
		try {
			// load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			return DriverManager.getConnection(url + datebaseName, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static Connection getConnection() {
		return getConnectionToMysql();
	}
}
