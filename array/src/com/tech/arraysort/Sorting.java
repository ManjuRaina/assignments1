package com.tech.arraysort;

import java.util.Scanner;

public class Sorting {
 
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int []a= {10,20,30,40,50,60,70,80};// decleartion and intializtaion
	int n=a[0];
	for(int i=0;i<a.length;i++)// smallest(for int i=0; i>a.length;i++)
	{
		if(n<a[i])
		{
			n=a[i];
		}
	}
	System.out.println("largest element is "+n);

	}

}
