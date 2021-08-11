package com.ABCBank.Account;

import java.util.Date;

public class Account {
	private double Balance;
	private String ownerName;
	private Date createDate;
	private String type;
	private String Status;
	
	public Account(double balance, String ownerName, Date createDate, String type, String status) {
		super();
		this.Balance = balance;
		this.ownerName = ownerName;
		this.createDate = createDate;
		this.type = type;
		this.Status = status;	
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
}
