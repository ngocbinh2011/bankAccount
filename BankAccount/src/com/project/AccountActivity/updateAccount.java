package com.project.AccountActivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.CustomerAccount.Account;

public class updateAccount {
	final static String SQLupdate = "UPDATE accounts SET ACCOUNTBALANCE = ?, password = ?"
			+ "WHERE ACCOUNTNUMBER = ?";
			
	public static void updateAccountDatabase(Account account) throws SQLException {
		Connection connection = databaseConnection.getConnection();
		
		if(connection == null) {
			return;
		}
		
		String accountNumber = account.getAccountNumber();
		long accountBalance = account.getAccountBalance();
		String accountPassword = account.getPassword();
		
		PreparedStatement preparedStatement = connection.prepareStatement(SQLupdate);
		
		preparedStatement.setLong(1, accountBalance);
		preparedStatement.setString(2, accountPassword);
		preparedStatement.setString(3, accountNumber);
		
		preparedStatement.executeUpdate();
		
	}
	

}
