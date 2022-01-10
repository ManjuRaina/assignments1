package com.te.treeset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;
public class TreeSet1 {

	
	public static void main(String[] args) {
		TreeSet<Object> treeSet = new TreeSet<Object>();
		treeSet.add(12);
		treeSet.add(13);
		treeSet.add(14);
		treeSet.add(15);
		
		for(Object o:treeSet)
		{
			System.out.println(o);
		}
		
		System.out.println("======================");
		
		       ArrayList<Integer> arrayList = new ArrayList (treeSet);
		       ListIterator<Integer> listiterator = arrayList.listIterator(arrayList.size());
		       
		      while(listiterator.hasPrevious())
		      {
		    	  System.out.println(listiterator.previous());
		      }
		
	}

	
}
