   package com.te.programs;

import java.util.Scanner;

public class DuplicateFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array length");
		int size=sc.nextInt();
		System.out.println("enter a array");
		int []a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			 
		}
		int len=a.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				
				if(a[i]==a[j]) {
					a[j]=a[len-1];
					len--;
		 		}
			}
			
		}
		System.out.println("new array");
		
		for (int i = 0; i < len; i++) {
			System.out.println(a[i]);
		}		

	}

}
