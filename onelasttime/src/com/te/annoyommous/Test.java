package com.te.annoyommous;

public class Test {

	public static void main(String[] args) {
		Draw d=new Draw() {

			@Override
			public void m1() {
				System.out.println("method-1");
				
			}
			
		};
		d.m1();

	}

}
