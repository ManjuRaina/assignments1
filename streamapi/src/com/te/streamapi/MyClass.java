 package com.te.streamapi;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {

	

	public static void main(String[] args) {
		List<Employee> list=Arrays.asList(new Employee(101, "Vivek", 25000, "Developer", 23),
				                           new Employee(103, "manju", 30000, "Hr", 22),
				                           new Employee(102, "raju", 17000, "Developer", 17),
				                           new Employee(104, "malli", 40000, "Developer", 21),
				                           new Employee(105, "ramu", 600000, "Md", 50));
	
		
		Employee e=list.get(0);
		for (int i = 1; i <list.size(); i++) {
			if(e.getAge()>list.get(i).getAge() ) {
				e=list.get(i);
			}
			}
		System.out.println(e);
		System.out.println("=======================");
		
		Stream<Employee>stream=list.stream();
	   Optional <Employee> min=stream.min(Comparator.comparing(Employee::getSalary));
	   System.out.println(min);
	   
	   System.out.println("=================");
	   
	   list.stream().min(Comparator.comparing(Employee::getAge)).ifPresent(System.out::println);
	   System.out.println("=================================");
	   //sorting
	   
	   List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());
	   collect.forEach(System.out::println);
	   
	   Map<String, List<Employee>> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getDesigination));
	   collect2.forEach((department1,emp)->{
		   System.out.println(department1);
		   emp.forEach(System.out::println);
	   });
	   System.out.println("====================");
	    list.stream().filter(em->em.getAge()>20).collect(Collectors.toList()).forEach(System.out::println);
	    
		   System.out.println("====================");
		   list.stream().filter(em->em.getSalary()>30000).collect(Collectors.toList()).forEach(System.out::println);
		   
		   System.out.println("====================");
		   
		   boolean anyMatch = list.stream().anyMatch(em->em.getAge()>25);
		   System.out.println(anyMatch);
		       

	}

}
