package com.te.functionalinterface;

public class Demo implements Test {

	@Override
	public void msg() {
		System.out.println("message is printed");
		
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.msg();
	}

}
