package com.te.customexception1;

public class VoterId {
	private String name;
	private int age;
	public VoterId(String name, int age)throws BelowAge {
		if(age<=18) {
			throw new BelowAge("the person is not eligible to vote " +age);
		}else {
		
		this.name = name;
		this.age = age;
		System.out.println("eligible to vote");
	}
	}
	
	

}
