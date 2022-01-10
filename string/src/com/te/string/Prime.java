package com.te.string;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner in = new Scanner ( System.in);
	int input = in.nextInt();
	  for (int i =1 ; i <= input; i++) {
		  boolean check = true ;
		for (int j = 2; j < i; j++) {
			if (i%j == 0) {
				check = false;
				break;
			}
		}
		if (check == true ) {
			System.out.println(i);
		}
	}
	
}
}
