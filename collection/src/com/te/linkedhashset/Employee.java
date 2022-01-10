package com.te.linkedhashset;

public class Employee {
	
	int empid;
	String empname;
	int empsal;
	public Employee(int empid, String empname, int empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	
	
	
	

}