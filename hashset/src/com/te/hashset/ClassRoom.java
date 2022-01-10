package com.te.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ClassRoom {

	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<>();
		Student student = new Student(12, "manju", 60);
		Student student1 = new Student(17, "malli", 80);
		Student student2 = new Student(15, "raju", 70);
		Student student3 = new Student(16, "ravi", 90);
		hashSet.add(student);
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		Student student4 = new Student(15, "raju", 70);
		hashSet.add(student4);

		Iterator<Student> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("====================");

		ArrayList<Student> arrayList = new ArrayList<Student>(hashSet);
		Collections.sort(arrayList, new SortByMark());

		Iterator<Student> iterator1 = arrayList.iterator();

		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
