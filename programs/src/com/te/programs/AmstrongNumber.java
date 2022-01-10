 package com.te.programs;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,sum=0;
		int temp=n;
  while(n>0)
  {
	  a=n%10;
	  sum=sum+(a*a*a);
	  n=n/10;
	  
  }
  if(temp==sum)
  {
	  System.out.println("amstrong number");
  }
  else
  {
	  System.out.println("not amstrong number");
  }
	}

}
