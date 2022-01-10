package com.technoelevate.operators;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter  8 for calculator  and 9 for GST");
		int s=sc.nextInt();
		if(s==8)
		{
			System.out.println("enter 1 for add");
			System.out.println("enter 2 for sub");
			System.out.println("enter 3 for mul");
			System.out.println("enter 4 for div");
			System.out.println("enter 5 for mod");
			
			int z=sc.nextInt();
			
			System.out.println("enter the first value");
			int d1=sc.nextInt();
			System.out.println("enter the second values");
			int d2=sc.nextInt();
			
			switch(z)
			{

			case 1:
				   int a=d1+d2;
				   System.out.println(a);
				   break;
			case 2:
				   int b=d1-d2;
				   System.out.println(b);
				   break;
			case 3:
				   int c=d1*d2;
				   System.out.println(c);
				   break;
			case 4:
				   int d=d1/d2;
				   System.out.println(d);
				   break;
			case 5:
				   int e=d1%d2;
				   System.out.println(e);
				   break;
			}
			
		}
		 
		else if(s==9)
		{
			System.out.println(" enter the original amount"); 
			double amt=sc.nextDouble();
			double gst=(amt*((18/100)));
			double netTotal=amt-gst;
			double actualTotal=amt+gst;
			System.out.println(netTotal);
			System.out.println(actualTotal);
			
		}
		else
		{
			
			System.out.println("enter correct alphabet");
			
			
			
			
		}
		
	 	}
}
 