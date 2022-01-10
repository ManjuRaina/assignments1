package com.tech.decisionStatements;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the leap year");
		int n=sc.nextInt();
		if((n%4==0||n%400==0 )&&(n%100!=0))
		{
			System.out.print("leap yaer");
		}
		else
		{
			System.out.print("not leap year");
		}

	}

}
