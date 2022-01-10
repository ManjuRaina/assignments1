package com.te.synchronizationexample;

public class BoyFriend extends Thread {
	Account account;

	public BoyFriend(Account account) {
		super();
		this.account = account;
	}
	@Override
	public void run(){
		for(int i=0;i<100;i++) {
			account.deposit(200);
		}
		System.out.println("Boy friend completed deposited");
	}  

}
