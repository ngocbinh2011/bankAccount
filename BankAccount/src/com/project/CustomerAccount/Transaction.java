package com.project.CustomerAccount;

import java.sql.SQLException;
import java.util.Scanner;

import com.project.AccountActivity.accountTransaction;
import com.project.AccountActivity.getAccountDatabase;

public class Transaction {
	static Scanner sc = new Scanner(System.in);
	
	public static String getStringFromCustomer() {
		return sc.next();
	}
	
	public static void transactionSuccess(Account account) {
		System.out.println("transaction is success!");
		System.out.println("your balance is " + account.getAccountBalance());
	}
	
	public static int getChoose() {
		
		System.out.println("PLEASE choose:");
		System.out.println("1.withdraw");
		System.out.println("2.recharge");
		System.out.println("3.transfer");
		System.out.println("4.check balance");
		System.out.println("5.change password");
		System.out.println("6.show information account");
		System.out.print("you choose: ");
		return sc.nextInt();
	
	}
	
	public static void createMenuTransaction(Account account) throws SQLException {
		
		int choose = getChoose();
		accountTransaction transaction = new accountTransaction();
		
		switch (choose) {
			
			case 1:
				System.out.print("enter money: ");
				long moneyWithdraw = sc.nextLong();
				transaction.withdraw(moneyWithdraw, account);
				transactionSuccess(account);
				break;
			case 2:
				System.out.print("enter money: ");
				long moneyRecharge = sc.nextLong();
				transaction.recharge(moneyRecharge, account);
				break;
			case 3:
				System.out.print("enter number account receiver: ");
				String receiver = sc.next();
				Account accountReceiver = getAccountDatabase.getInformationAccount(receiver);
				System.out.print("\nenter money: ");
				long moneyTransfer = sc.nextLong();
				transaction.transfer(moneyTransfer, accountReceiver, account);
				transactionSuccess(account);
				break;
			case 4:
				System.out.println("your balance is " + transaction.getBalanceAccount(account));
				System.out.println("transaction is end.");
				break;
			case 5:
				System.out.print("enter your old password: ");
				String oldPassword = sc.next();
				System.out.print("\nenter your new password: ");
				String newPassword = sc.next();
				transaction.changePassword(account, oldPassword, newPassword);
				System.out.println("transaction is end.");
				break;
			case 6:
				transaction.showInformation(account);
				System.out.println("transaction is end");
				break;
		}
		
	}
}
