package com.te.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
	
		List<Integer>l1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer>l2=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list);

	}

}
