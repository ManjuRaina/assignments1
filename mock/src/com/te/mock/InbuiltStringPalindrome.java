package com.te.mock;

import java.util.Scanner;

public class InbuiltStringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the string" );
		String s=sc.nextLine();
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		String rev =stringBuilder.toString();
		if(s.equals(rev)) {
			System.out.println("is plaindrome");
			}else {
				System.out.println("not palindrome");
			}

	}

}
 