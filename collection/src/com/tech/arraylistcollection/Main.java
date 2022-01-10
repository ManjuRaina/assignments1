package com.tech.arraylistcollection;

import java.util.Collections;
import java.util.Iterator;

public class Main {

	
	public static void main(String[] args) {
 MyArrayList l=new MyArrayList(2);
 l.add(10);
 l.add(20);
 l.add(30);
 l.add(40);
 l.add(50);
 l.add(60);
 l.remove(1);
 
 Iterator iterator = l.iterator();
 
 while(iterator.hasNext())
 {
	 System.out.println(iterator.next());
 }
 System.out.println(l);
// Collection.reverse(l);

	}

}
