package com.te.hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Boy {
	@Id
private int bid;
private String name;
private double balance;

@OneToOne
private Girl girl;

public int getBid() {
	return bid;
}

public void setBid(int bid) {
	this.bid = bid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Girl getGirl() {
	return girl;
}

public void setGirl(Girl girl) {
	this.girl = girl;
}




}
