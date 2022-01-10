package com.tech.power;
import java.util.*;
public class Power 
{
public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value for a");
	int a=sc.nextInt();
	System.out.println("enter a value for b");
	int b=sc.nextInt();
	System.out.println("enter number of iteration ");
	int n=sc.nextInt();
	System.out.println("GP");
	double d=(a+Math.pow(2, 0)*b);
	System.out.println(d+",");
	for(int i=0;i<n;i++)
	{
		d=d+Math.pow(2, i)*b;
		System.out.println(d+",");
	}
		

	}

}
