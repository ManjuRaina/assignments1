package com.te.factorydesign;

import java.util.Scanner;

public class Factory {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the brand boss");
	    String s=sc.next();
	    driver.driver(s);
		

	}

}
