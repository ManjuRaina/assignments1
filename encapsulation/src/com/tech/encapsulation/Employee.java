package com.tech.encapsulation;

public class Employee 
{
	private int empId;
	private int age;
	private String name;
	private static  String  designation="software engineer";

	
	public void setAge(int age)
	{
		if(age>0 && age<100)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Foolish guy don't test me ");
		}
		
	}
	public void getAge()
	{
		System.out.println(age);
	}
	public void setempId(int empId)
	{
		this.empId=empId;
	}
	public void getempId()
	{
		System.out.println(empId);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void getname()
	{
		System.out.println(name);
	}
	public void  setDesignation( String designation)
	{
		this.designation=designation;
	}
	public void getdesignation()
	{
		System.out.println(designation);
	}
	
	
	

}
