package com.te.pgms;

import java.sql.Array;
import java.util.Iterator;

public class MyArraylist {
	
	Object[] array;
	int position;
	
	public MyArraylist(int size) {
		array=new Object[size];
	}
	
	public void add(Object obj) {
		if(position>=array.length) {
			increaseCapacity();
		}
		array[position]=obj;
		position++;
	}

	private void increaseCapacity() {
		Object[] temp=new Object[array.length+3];
		for (int i = 0; i < position; i++) {
			temp[i]=array[i];
		}
		
		array=temp;
	}
	public void remove(int Index) {
		for (int i = Index; i < position; i++) {
			array[i]=array[i+1];
		}
		position--;
	}
	private class MyItr implements Iterator{
		int index;

		@Override
		public boolean hasNext() {
			
			return(index<position) ?true:false;
		}

		@Override
		public Object next() {
			
			return array[index++];
		}
	}

	

}
