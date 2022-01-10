
package com.te.annyomous;

public class myClass1 {

	public static void main(String[] args) {
		Test1 t2=new Test1() {
			
			@Override
			public void message() {
		System.out.println("namaste");
				
			}
		};
		t2.message();

	}

}
