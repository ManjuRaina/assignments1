package com.te.mock;

import java.util.Scanner;

public class SortingArrayDyanmically {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a array length");
	int size=sc.nextInt();
	int a[]=new int[size] ;
	System.out.println("entere the array");
	for(int i=0;i<size;i++) {
		a[i]=sc.nextInt();
	}
	int temp;
	for(int i=0;i<size;i++){
		for(int j=0;j<size;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
                a[j]=temp;
		}
	}
		}
	for(int i=0;i<size;i++) {
		System.out.println(a[i]);
	}
	System.out.println("===========");
	
	System.out.println("smallest"+a[1]); 
	System.out.println("===========");
	System.out.println("largest"+a[size-2]);
	
	

	}

}
