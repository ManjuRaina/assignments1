package com.te.treeset;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
      TreeSet<Integer> treeSet = new TreeSet<>();
      treeSet.add(10);
      treeSet.add(20);
      treeSet.add(30);
      treeSet.add(40);
      treeSet.add(50);
      treeSet.add(60);
      treeSet.add(70);
      treeSet.add(80);
      System.out.println(treeSet);
      System.out.println("===========s");
      System.out.println(treeSet.descendingSet());
		System.out.println("================");
		System.out.println(treeSet.containsAll(treeSet));
		System.out.println("================");
		  System.out.println(treeSet.addAll(treeSet));
		  System.out.println(treeSet.clone()); for (Integer integer : treeSet) {
		  System.out.println(integer);
		  
		  }
		 
	}

}
