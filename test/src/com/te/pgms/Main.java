package com.te.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(50);
		al.add(60);
		System.out.println(al);
		
		Iterator<Integer> iterator = al.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		

	}

}
