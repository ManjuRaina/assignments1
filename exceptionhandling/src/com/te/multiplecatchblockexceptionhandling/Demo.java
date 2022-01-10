package com.te.multiplecatchblockexceptionhandling;
//arrayindexoutofbound
public class Demo {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[10]=30;
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException occure");
				e.printStackTrace();
			}catch (ArithmeticException e) {
				System.out.println("ArithmaticExcepton occure ");
				e.printStackTrace();
			
			}catch (Exception e) {
				System.out.println("parentException occure");
				e.printStackTrace();
			}
			System.out.println("rest of the code occure");
			
			

	}

}
