package com.te.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Product1> list = new ArrayList<Product1>();
		list.add(new Product1(1, "lenvo", 35000f));
		list.add(new Product1(2, "hp", 45000f));
		list.add(new Product1(3, "dell", 55000f));
		list.add(new Product1(4, "macbook", 85000f));
		System.out.println(list);
		
		System.out.println("=========================");
		 List<Product1> collect = list.stream().filter(p->p.price>45000).collect(Collectors.toList());
		System.out.println(collect);
	}

}
