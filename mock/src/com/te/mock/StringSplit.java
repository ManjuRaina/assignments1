 package com.te.mock;

public class StringSplit {

	public static void main(String[] args) {
		String s1="i am good";
		String[] s2=s1.split(" ",3);
		for(int i=s2.length-1;i>=0;i--) {
			System.out.println(s2[i]);
		}
				

	}

}
