package com.project.CustomerAccount;

import java.sql.SQLException;

public class ManagerTransaction {
	public static void main(String[] args) {
		System.out.println("welcome to my bank");
		Customer customer = new Customer();
		try {
			customer.createTransaction();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("eror...please try again");
		}
	}
}
