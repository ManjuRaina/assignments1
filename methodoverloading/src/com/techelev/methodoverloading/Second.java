package com.techelev.methodoverloading;

public class Second extends First
{
	public void m1()
	{ 
		
		System.out.println("from second");
		super.m1();
	}
  public static void m2()
  {
	  System.out.println("static from second");
  }
}
