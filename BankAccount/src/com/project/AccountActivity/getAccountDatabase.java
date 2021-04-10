package com.project.AccountActivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.CustomerAccount.Account;

public class getAccountDatabase {
	
	static final String sql = "SELECT * FROM accounts WHERE accountnumber = ?";
	
	
	public static Account getInformationAccount(String accountNumber) throws SQLException {
		Connection connection = databaseConnection.getConnection();
		
		if(connection == null) {
			System.out.println("connect fail");
			return null;
		}
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
		preparedStatement.setString(1, accountNumber);
			
		ResultSet resultSet = preparedStatement.executeQuery();
			
		if(!resultSet.next()) return null;
		
		return new Account(resultSet.getString(1), resultSet.getString(2), resultSet.getLong(3), 
				resultSet.getDate(4), resultSet.getDate(5), resultSet.getString(6));
		
	}
}
