package com.tech.arraylistcollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
	List<Emp> list = Arrays.asList(new Emp(1, "manju", 10000),
			new Emp(2, "malli", 20000),
			new Emp(3, "hashad", 30000),
			new Emp(4, "siddhu", 40000));
	
//	Collections.sort(list, new SortBySal());
//	System.out.println(list);
	
	Collections.sort(list);
     System.out.println(list);
	}

}
