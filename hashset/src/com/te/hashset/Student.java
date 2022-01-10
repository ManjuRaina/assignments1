package com.te.hashset;

public class Student {
 
	int rollnumber;
	String name;
	int marks;
	public Student(int rollnumber, String name, int marks) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
