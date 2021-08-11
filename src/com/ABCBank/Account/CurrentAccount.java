package com.ABCBank.Account;

import java.util.Date;

public class CurrentAccount extends Account{
	
	private double overDraftBalance;
	public CurrentAccount(double balance, String ownerName, Date createDate, String type, String status, double overDraftBalance) {
		super(balance, ownerName, createDate, type, status);
		this.overDraftBalance = overDraftBalance;
	}
	public double getOverDraftBalance() {
		return overDraftBalance;
	}
	
}
