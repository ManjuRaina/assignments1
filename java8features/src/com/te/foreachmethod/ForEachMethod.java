package com.te.foreachmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
	List<Integer> arrayList=Arrays.asList(1,18,45,3,7,10,12,99,93,33);
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
		
	}
	System.out.println("==============for each loop=============");
	
	for (Integer integer : arrayList) {
		System.out.println(integer);
	}
		System.out.println("=============iterator=============");
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("============for each method");
		arrayList.forEach(System.out::println);
	}

	}


