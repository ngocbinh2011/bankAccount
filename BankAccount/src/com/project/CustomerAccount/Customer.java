package com.project.CustomerAccount;

import java.sql.SQLException;
import java.util.Scanner;

import com.project.AccountActivity.getAccountDatabase;
import com.project.AccountActivity.login;

public class Customer {
	
	Scanner sc = new Scanner(System.in);
	
	public String getStringFromCustomer() {
		return sc.next();
	}	
	
	public void createTransaction() throws SQLException {
		System.out.println("you must login to create a transaction");
		System.out.print("enter your account number: ");
		String accountNumber = getStringFromCustomer();
		System.out.print("\nenter your password: ");
		String password = getStringFromCustomer();
		
		boolean isLoginSuccess = login.checkPassword(accountNumber, password);
		
		if(!isLoginSuccess) {
			System.out.println("account number or password is wrong.");
			return;
		}
		
		Account customerAccount = getAccountDatabase.getInformationAccount(accountNumber);
		Transaction.createMenuTransaction(customerAccount);
		
	}
	
	
}
