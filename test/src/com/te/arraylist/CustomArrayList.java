package com.te.arraylist;

import java.util.Iterator;

public class CustomArrayList {
	Object[] array;
	int position;
	
	
	public CustomArrayList(int size) {
		array=new Object[size];
	}
	public void add(Object obj) {
		if(position>=array.length) {
			increaseCapacity();
		}
		array[position]=obj;
		position++;
	}
	public void increaseCapacity() {
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
	private class MyItr implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
		
			return (index<position)?true:false;
		}

		@Override
		public Object next() {
	
			return array[index++];
		}
	}

	
	

}
