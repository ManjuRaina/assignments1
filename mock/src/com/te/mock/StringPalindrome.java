package com.te.mock;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the string");
	 String s=sc.nextLine();
	 String reverse="";
	 for(int i=s.length()-1;i>=0;i--) {
		 reverse=reverse+s.charAt(i);
	 }
	 System.out.println(reverse);
	 if(s.equals(reverse)) {
		 System.out.println("palindrome");
	 }else {
		 System.out.println("not palindrome");
	 }

	}

}
