package com.te.polymorphism;

public class Main {

	public static void main(String[] args) {
	 Demo d=new Demo();
	 d.m1();
	 System.out.println(d.x);
	 System.out.println("===================");
	 Test t=new Test();
	 t.m1();
	 System.out.println(t.x);
	 System.out.println("===============");
	 Test s=new Demo();
	 s.m1();
	 System.out.println(s.x);

	}

}
