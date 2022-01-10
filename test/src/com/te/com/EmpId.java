package com.te.com;

import java.util.Comparator;

public class EmpId implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		return (int) o1.empid-o2.empid;
	}

}
