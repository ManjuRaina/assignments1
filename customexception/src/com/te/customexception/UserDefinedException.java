package com.te.customexception;

public class UserDefinedException {

	public static void main(String[] args) {
		

		try {
			throw new MyException(" my string should be first");
		} catch (MyException e) {
			System.out.println(e);
		
		}
	}

}
