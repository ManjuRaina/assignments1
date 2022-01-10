package com.te.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> asList = Arrays.asList(new Employee(1, "manju", 24),
				new Employee(3, "allu", 35),
				new Employee(2, "fahad", 30));
		
//		Collections.sort(asList);
//		asList.forEach(System.out::println);
		System.out.println(asList);
	}

}
