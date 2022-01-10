package com.te.mock;

import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char[]a=s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]<a[j]) {
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				System.out.print(a[i]);
			}
			
		}
		System.out.println(a[a.length-1]);
		

	}

}
