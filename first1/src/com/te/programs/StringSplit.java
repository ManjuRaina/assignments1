 package com.te.programs;

public class StringSplit {

	public static void main(String[] args) {
		String s="my name is manju";
		String []s1=s.split(" ",4);
		for (int i = s1.length-1; i >=0 ; i--) {
			System.out.print(s1[i]+" ");
		}

	}

}
