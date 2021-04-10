package com.project.CustomerAccount;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	private String accountNumber;
	private String memberName;
	private long accountBalance;
	private Date registryDay;
	private Date expired;
	private String password;

	
	public Account() {
		
	}
	
	public Account(String accountNumber, long accountBalance, String password) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public Account(String accountNumber, String memberName, long accountBalance, 
			Date registryDay, Date expired, String password) {
		this.accountNumber = accountNumber;
		this.memberName = memberName;
		this.accountBalance = accountBalance;
		this.registryDay = registryDay;
		this.expired = expired;
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Date getRegistryDay() {
		return registryDay;
	}

	public void setRegistryDay(Date registryDay) {
		this.registryDay = registryDay;
	}

	public Date getExpired() {
		return expired;
	}

	public void setExpired(Date expired) {
		this.expired = expired;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String parseDate(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
		return simpleDateFormat.format(date);
	}
	
	public void showInformationAccount() {
		System.out.println("account number: " + accountNumber);
		System.out.println("account balance: " + accountBalance);
		System.out.println("account member name: " + memberName);
		System.out.println("account registry date: " + parseDate(registryDay));
		System.out.println("account expired date: " + parseDate(expired));
		System.out.println("account password: " + password);
		
	}
	
}
