package com.te.programs;

import java.util.Scanner;

public class Prime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");

		int m = sc.nextInt();
		for (int i = 1; i <= m; i++) {

			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}

	}

	private static boolean isPrime(int n) {
		for (int j = 2; j < n / 2; j++) {
			if (n % j == 0) {
				return false;
			}

		}
		return true;
	}



 }
