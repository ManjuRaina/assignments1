package com.te.streamapi;

public class Employee {
	int empId;
	String empName;
	int salary;
	String desigination;
	int age;
	
	public Employee(int empId, String empName, int salary, String desigination, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.desigination = desigination;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public String getDesigination() {
		return desigination;
	}

	
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

	
	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", " + (empName != null ? "empName=" + empName + ", " : "") + "salary="
				+ salary + ", " + (desigination != null ? "desigination=" + desigination + ", " : "") + "age=" + age
				+ "]";
	}
	
	

}
