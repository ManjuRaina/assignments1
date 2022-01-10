package com.te.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	public static void main(String[] args) {
		List<Demo> list = Arrays.asList(new Demo("manju",200000.0f),
				new Demo("malli",300000.0f),
				new Demo("neelamma",400000.0f));
		System.out.println(list);
		List<Demo> collect = list.stream().filter(p->p.price>300000).collect(Collectors.toList());
		System.out.println(collect);
		list.stream().min(Comparator.comparing(Demo::getPrice)).ifPresent(System.out::println);
		System.out.println("========");
		list.stream().sorted(Comparator.comparing(Demo::getName)).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("========");
		list.stream().max(Comparator.comparing(Demo::getPrice)).ifPresent(System.out::println);
		
	}

}
