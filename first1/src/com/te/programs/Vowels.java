package com.te.programs;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="hello world";
		char []a=s.toCharArray();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
				count++;
			}
			
		}
		System.out.println("number of vowels " + count);

	}

}
