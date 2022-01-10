package com.te.customexception;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the balance");
	Double balance=sc.nextDouble();
	System.out.println("enter the withdraw");
	Double withdraw=sc.nextDouble();
	
	if(balance>=withdraw) {
		balance=balance-withdraw;
		throw new MyBalance("succesful transaction"+balance);
		
	}else {
		System.out.println("insufficent balance");
	}

	}

}
