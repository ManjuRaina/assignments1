package com.te.mock;

import java.util.Scanner;

public class RemoveDuplicateFromarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array length");
		int size=sc.nextInt();
		int a[]=new int[size] ;
		System.out.println("enter the array");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int len=a.length;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					a[j]=a[len-1];
				}
			}
		}
		System.out.println("new array");
		for(int i=0;i<len-1;i++) {
			System.out.println(a[i]);
		}
		}
		
		
	}

 
