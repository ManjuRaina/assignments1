package com.te.string;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
	    String s=sc.nextLine();
	    
	    String n=" ";
	    char prevChar=' ';
	    for(int i=0;i<s.length();i++) {
	    	if(prevChar!=s.charAt(i)) {
	    		n=n+s.charAt(i);
	    		prevChar=s.charAt(i);
	    		
	    	}
	    	
	    	
	    }
	    System.out.println(" new string");
	    System.out.println(n);

	}

}
