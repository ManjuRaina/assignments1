package com.te.programs;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--) {
        	rev=rev+s.charAt(i);
        }
        System.out.println("reverse");
        if(s.equals(rev)) {
        	System.out.println("is palindrome");
        }else 
        {
        	System.out.println("not palindrome");
        } 

	}

}
