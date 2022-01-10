package com.te.streamapi;

public class Employee {
	int empId;
	double salary;
	String empName;
	public Employee(int empId, double salary, String empName) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", " + (empName != null ? "empName=" + empName : "")
				+ "]";
	}
	

	
}
