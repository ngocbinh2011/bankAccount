package com.project.AccountActivity;

import com.project.CustomerAccount.Account;

public interface accountTrade {
	
	void withdraw(long money, Account account) throws Exception;
		
	void recharge(long money, Account account) throws Exception;

	void transfer(long money, Account accountReceiver, Account accountSender) throws Exception; 

	long getBalanceAccount(Account account) throws Exception;
	
	void changePassword(Account account, String oldPassword, String newPassword) throws Exception;
	
	void showInformation(Account account);

		
}
