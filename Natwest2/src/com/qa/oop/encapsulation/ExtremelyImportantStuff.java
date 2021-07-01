package com.qa.oop.encapsulation;

public class ExtremelyImportantStuff {

	private int passportNumber;
	private int accountNumber;
	private double bankBalance; 
	
	ExtremelyImportantStuff(int passportNumber, int accountNumber, double bankBalance) {
		
		this.passportNumber = passportNumber;
		this.accountNumber = accountNumber;
		this.bankBalance = bankBalance;
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	

	
	}
