package com.tech.decisionStatements;
import java.util.Scanner;
public class Second {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for month ");
	    int n=sc.nextInt();
	    System.out.println("enter a year");
	    int c=sc.nextInt();
		switch(n)
		{
		case 1:
		
		    System.out.println("31 days");
			break;
			
		case 2:
		{
			if(((c%4==0 ||c%400==0) ) && (c%100!=0))
			{
				System.out.println("29 days and a leap year");
			}
			else      
			{
			
			System.out.println("28 days and not a leap year ");
			}
			break;
		}
		case 3:
		
			System.out.println("31 days");
			break;
		
		
		case 4:
		{
			System.out.println("30 days");
			break;
		}
		
		case 5:
		{
			System.out.println("31 days");
			break;
		}
		
		case 6: 
		{
			System.out.println("30 days");
			break;
		}
		
		case 7:
		{
			System.out.println("31 days");
			break;
		}
		
		case 8:
		{
			System.out.println("31 days");
			break;
		}
		
		case 9:
		{ 
			System.out.println("30days");
			break;
		}
		
		case 10:
		{
			System.out.println("31 days");
			break;
		}
		
		case 11:
		{
			System.out.println("30days");
			break;
		}
		
		case 12:
		{
			System.out.println("31 days");
			break;
		}
		default :
		{
			System.out.println(" enter correct number");
		}
		
		
		}	
	}
	}
