package com.te.myarraylist;

import java.util.Iterator;

public class MyArrayList {
	Object[] array;
	int position;

	public MyArrayList(int size) {
		array = new Object[size];
	}

	public void add(Object obj) {
		if (position <= array.length) {
			increasedCapacity();
		}
		array[position] = obj;
		position++;
	}

	private void increasedCapacity() {
		Object[] temp = new Object[array.length + 3];
		for (int i = 0; i < position; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public void remove(int index) {
		for (int i = index; i < position; i++) {
			array[i] = array[i + 1];
		}
		position--;
	}
	
	public String tostring() {
		String s="["+array[0];
		for(int i=1;i<position;i++) {
			s+=","+array[i];
		}
		s+="]";
		return s;
		
	}

	public Iterator iterator() {
		return new MyItr();
	}

	public class MyItr implements Iterator {
		int index;

		@Override
		public boolean hasNext() {

			return (position < index) ? true : false;
		}

		@Override
		public Object next() {

			return array[index++];
		}

	}
}
