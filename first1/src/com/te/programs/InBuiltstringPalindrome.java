package com.te.programs;

import java.util.Scanner;

public class InBuiltstringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
        String s=sc.nextLine();
        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        String rev=stringBuilder.toString();
        if(s.equals(rev)) {
        	System.out.println("is palindrome");
        }else
        {
        	System.out.println("not palindrome");
        }
	}

}
