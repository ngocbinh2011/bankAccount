package com.project.AccountActivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login {
	public static boolean checkPassword(String accountNumber, String password) throws SQLException {
		Connection connection = databaseConnection.getConnection();
		if(connection == null) {
			System.out.println("connect fail, please try later....");
			return false;
		}
		String sql = "SELECT PASSWORD FROM ACCOUNTS WHERE ACCOUNTNUMBER = ? ";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, accountNumber);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			return resultSet.getString(1).equals(password);
		}
		
		return false;
		
	}
}
