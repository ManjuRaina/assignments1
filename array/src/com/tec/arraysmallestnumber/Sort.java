package com.tec.arraysmallestnumber;

import java.util.Scanner;

public class Sort 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter a array");
		int a[]=new int[n];
		int temp;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j]) // if(a[i]>a[j])->> big to less 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int x:a)//->>>>>>>foreachloop
		{
			System.out.println(x);
			
		}
		
		
		System.out.println(a[3]);
	}
		

}
