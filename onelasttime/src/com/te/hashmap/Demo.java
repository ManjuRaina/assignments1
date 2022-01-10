package com.te.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		HashMap<Long, String> hashMap = new HashMap<>();
		hashMap.put(9353214549l, "manju");
		hashMap.put(7676670148l, "neelamma");
		hashMap.put(7204314549l, "malli");
		hashMap.put(8880669289l, "ramu");
		hashMap.put(7026124432l, "ravi");
		hashMap.put(9353214859l, "raju");
		System.out.println(hashMap);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the key");
		Long keys=sc.nextLong();
		System.out.println(hashMap.get(keys));
		/*
		 * hashMap.keySet(); 
		 * System.out.println(hashMap);
		 *  hashMap.entrySet();
		 * System.out.println();
		 */
	
		

	}

}
