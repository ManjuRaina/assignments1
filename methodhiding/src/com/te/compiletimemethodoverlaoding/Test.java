package com.te.compiletimemethodoverlaoding;

public class Test {

	private static Test test;

	static void display(int a) {
		System.out.println(a);
	}
	static void display(int a,int b) {
		System.out.println("display"+a+" "+b);
	}
	
	static void display() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		
Test test=new Test();
test.display();
test.display(10);
test.display(10, 20);
	}

}
