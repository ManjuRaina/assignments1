package com.te.compiletimepolymorphism;

public class Demo {

	public static void main(String[] args) {
		Test test = new Test();
		 test.methodA(5);
		 test.methodA(5.5);
		 test.methodA(5, 10);
		 test.methodA(6, "manju");
		 test.methodA("malli", 9);
		 
	}

}
