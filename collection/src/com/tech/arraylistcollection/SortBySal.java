package com.tech.arraylistcollection;

import java.util.Comparator;

public class SortBySal implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
	
		return o1.sal-o2.sal;
	}

}
