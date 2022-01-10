package com.te.lambad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaUsingForeachLoop {



	public static void main(String[] args) {
	 List<Integer> asList = Arrays.asList(1,2,4,5,6,3,7,8);
	 System.out.println(asList);
	 asList.forEach(m ->System.out.println(m));
	}

}
