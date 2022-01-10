package com.techno.multilevel;

public class User 
{
	public static void main(String[] args)
	{
		MessageRead m=new  MessageRead();
		m.text();
		m.msgRead();
		m.textrecived();
		
		System.out.println("------------------------------");
		
		MessageRecivied r=new MessageRecivied();
		r.text();
		r.textrecived(); 
		
	}
	

}
