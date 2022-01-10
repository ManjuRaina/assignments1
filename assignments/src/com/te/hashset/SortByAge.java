package com.te.hashset;

import java.util.Comparator;

public class SortByAge implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {

		return o1.age- o2.age;
	}



}
