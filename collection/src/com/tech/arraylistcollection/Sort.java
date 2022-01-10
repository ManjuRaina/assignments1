package com.tech.arraylistcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Sort {

	
	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	Iterator iterator = a.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	//System.out.println(addddddd);
	Collections.reverse(a);
	System.out.println(a);

	}

}
