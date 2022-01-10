package com.Techelevat.dowhile;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n1 = sc.nextInt();
		do {
			if (n1 % 2 == 0) {
				System.out.println(n1 + " is even number");
			} else {
				System.out.println(n1 + " is odd number");
			}
		} while (n1 > 100);

	}

}
