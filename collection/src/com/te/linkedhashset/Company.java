
package com.te.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;



public class Company {

	public static <E> void main(String[] args) {
		LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<>();

		Employee employee = new Employee(101, "manju", 100000);
		Employee employee1 = new Employee(102, "malli", 200000);
		Employee employee2 = new Employee(103, "raju", 300000);
		Employee employee3 = new Employee(104, "ramu", 400000);

		linkedHashSet.add(employee);
		linkedHashSet.add(employee1);
		linkedHashSet.add(employee2);
		linkedHashSet.add(employee3);
		

		Iterator<Employee> iterator = linkedHashSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()); 
		}
		

		 
		System.out.println("=======================");

		LinkedList <Employee> linkedList = new LinkedList<>(linkedHashSet);
		Collections.sort(linkedList, new SortByEmpName());

		Iterator<Employee> iterator2 = linkedList.iterator();

		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
	
		}
		}

	}


