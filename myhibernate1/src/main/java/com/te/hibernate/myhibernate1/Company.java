package com.te.hibernate.myhibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Company {
	@Id
	 private int empId;
	 private String  CompanyName;
	 @OneToOne
	 private Employee employee;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Company [empId=" + empId + ", " + (CompanyName != null ? "CompanyName=" + CompanyName + ", " : "")
				+ (employee != null ? "employee=" + employee : "") + "]";
	}
	 
	

}
