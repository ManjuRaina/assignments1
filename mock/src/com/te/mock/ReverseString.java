package com.te.mock;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a String");
         String s=sc.nextLine();
       char []a=s.toCharArray() ;
       for(int i=a.length-1;i>=0;i--) {
    	   System.out.print(a[i]);
       }
	}

}
