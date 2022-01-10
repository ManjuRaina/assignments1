package com.te.customexception;

import java.util.Scanner;

public class voterBooth {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>18) {
			throw new BelowAge("eligible to vote");
		}else {
			throw new BelowAge("not eligible to vote");
		}
		
	}

}
