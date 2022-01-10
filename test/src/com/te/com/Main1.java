package com.te.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main1 {

	public static void main(String[] args) {
		List<Employee1> asList = Arrays.asList(new Employee1(24, "manju", 1),
				new Employee1(23, "malli", 2),
				new Employee1(22, "ravi", 3),
				new Employee1(21, "hanumanth", 4));
		
		Collections.sort(asList,new EmpId());
		asList.forEach(System.out::println);
	}

}
