package com.te.com;

import java.util.Comparator;

public class Employee1 implements Comparator<Employee1> {
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	String name;
	int  empid;
	public Employee1(int age, String name, int empid) {
		super();
		this.age = age;
		this.name = name;
		this.empid = empid;
	}
	
	@Override
	public String toString() {
		return "Employee1 [age=" + age + ", " + (name != null ? "name=" + name + ", " : "") + "empid=" + empid + "]";
	}
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	

	

}
