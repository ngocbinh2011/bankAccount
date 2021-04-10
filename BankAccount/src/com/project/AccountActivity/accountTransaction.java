package com.project.AccountActivity;

import java.sql.SQLException;
import com.project.CustomerAccount.Account;

public class accountTransaction implements accountTrade{
	
	
	@Override
	public void withdraw(long money, Account account) throws SQLException {
		
		if(account.getAccountBalance() < money) {
			return;
		}

		account.setAccountBalance(account.getAccountBalance() - money);		
		updateAccount.updateAccountDatabase(account);
		
	}
	
	@Override
	public void recharge(long money, Account account) throws SQLException {		
		
		account.setAccountBalance(account.getAccountBalance() + money);	
		updateAccount.updateAccountDatabase(account);
		
	}
	
	@Override
	public void transfer(long money, Account accountReceiver, Account accountSender) throws SQLException {

		withdraw(money, accountSender);
		recharge(money, accountReceiver);
		
	}
	
	@Override
	public long getBalanceAccount(Account account) throws SQLException {
		
		return account.getAccountBalance();
		
	}
	
	
	@Override
	public void changePassword(Account account, String oldPassword, String newPassword) throws SQLException {
		
		if(!oldPassword.equals(account.getPassword())) {
			return;
		}
		
		account.setPassword(newPassword);
		updateAccount.updateAccountDatabase(account);
		
	}
	
	@Override
	public void showInformation(Account account) {
		account.showInformationAccount();
	}

}
