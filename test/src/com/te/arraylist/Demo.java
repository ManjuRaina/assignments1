package com.te.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		List<String> asList = Arrays.asList("manju", "malli", "neelamma", "parvatamma", "nihal", "vikas", "chini");
		System.out.println(asList);

		// sort the list
		Collections.sort(asList);
		 System.out.println(asList);
		 
		 System.out.println("==========================");

		// list using iterator
		Iterator<String> iterator = asList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + ",");
		}
		
		System.out.println("==========================");
		
		// list using for each loop
		for (String string : asList) {
			System.out.println(string+",");
		}
		
		//list using listiterator
System.out.println("==========================");
		
		//set the value to list
		asList.set(5, "veeran gowda");
		System.out.println(asList);

	}

}