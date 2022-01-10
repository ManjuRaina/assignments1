   package com.te.string;

public class Demo {

	public static void main(String[] args) {
	
		String name="my name is ";
		name=name.toUpperCase();
		String []s=name.split(" ",3);
		for(String x:s)
		{
			System.out.println(x);
		}

	}

} 
  