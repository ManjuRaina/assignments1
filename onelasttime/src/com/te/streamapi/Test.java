package com.te.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		 List<Employee> asList = Arrays.asList(new Employee(1,20000,"manju"),
				new Employee(2, 25000, "malli"),
				new Employee(3, 26000, "ramu"),
				new Employee(4, 18000, "raju"));
	
		asList.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		List<Employee> collect = asList.stream().filter(em->em.getSalary()>18000).collect(Collectors.toList());
		System.out.println(collect);

	}

}
