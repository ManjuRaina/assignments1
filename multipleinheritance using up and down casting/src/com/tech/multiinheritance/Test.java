package com.tech.multiinheritance;

public class Test 
{

	public static void main(String[] args) 
	{
		Father f=new Son();
		Son s=(Son)f;
		s.eat();
		
	}

}
