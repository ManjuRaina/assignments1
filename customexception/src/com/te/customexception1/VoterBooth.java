package com.te.customexception1;

import java.util.Scanner;

public class VoterBooth {

	public static void main(String[] args)throws BelowAge {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the voter name");
		String b=sc.nextLine();
		System.out.println("enter the age");
		int c=sc.nextInt();
		VoterId voterId = new VoterId(b, c);
		
		System.out.println(" ");
		
		 

	}

}
