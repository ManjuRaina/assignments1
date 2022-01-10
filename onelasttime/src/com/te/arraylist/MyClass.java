package com.te.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>(2);
		arrayList.add(10);
		 arrayList.add(20);
		 arrayList.add(30);
		 arrayList.add(40);
		 arrayList.add(50);
		 arrayList.add(60);
		 arrayList.add(70);
		 arrayList.add(80);
		 arrayList.add(90);
		 arrayList.add(100);
		 System.out.println(arrayList);
		 
		 arrayList.remove(3);
		 System.out.println( arrayList);
		 
		 Iterator<Integer> iterator = arrayList.iterator();
		 while( iterator.hasNext()) {
			 System.out.print( iterator.next()+",");
		 }

	}

}
