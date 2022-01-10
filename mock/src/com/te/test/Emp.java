package com.te.test;

import java.util.Objects;

public class Emp {
	int empId;
	String empName;

	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;

	}

	@Override
	public int hashCode() {
		return Objects.hash(empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(empName, other.empName);
	}

	@Override
	public String toString() {
		return "Emp [" + (empName != null ? "empName=" + empName : "") + "]";
	}

	public static void main(String[] args) {

		Emp e = new Emp(1, "manju");
		e.empName = "manju";
		
		Emp e1=new Emp(2,"manju");
		e1.empName="manju";
		System.out.println(e.equals(e1));
		
	}

}
