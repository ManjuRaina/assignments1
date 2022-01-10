package com.te.multiplecatchblockexceptionhandling;

public class ArithmaticException1 {

	public static void main(String[] args) {
		try {
		int a[]=new int[5];
		a[5]=30/0;
		}catch (ArithmeticException e) {
			System.out.println("ArithmaticExcepton occure ");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occure");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("parentException occure");
			e.printStackTrace();
		}
		System.out.println("rest of the code occure");
		
		
		
	}

}
