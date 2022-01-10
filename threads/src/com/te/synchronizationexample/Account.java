package com.te.synchronizationexample;

public class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("Insufficient Funds");
			
		}else {
			balance=balance+amount;
		}
	}
	synchronized void deposit(int amount) {
		balance=balance+amount;
	}
	
	public void checkBalance() {
		System.out.println(balance);
	}
	

}
