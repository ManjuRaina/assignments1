package com.te.compiletimepolymorphism;

public class Test {
	public void methodA(int a) {
		System.out.println(a);
	}

	public void methodA(int a, int b) {
		System.out.println(a + b);
	}

	public void methodA(double d) {
		System.out.println(d);
	}

	public void methodA(int a, String b) {
		System.out.println("both a and b");
	}

	public void methodA(String a, int b) {
		System.out.println("one string and another integer");
	}
}
