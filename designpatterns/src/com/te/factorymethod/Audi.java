package com.te.factorymethod;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("zunn zuun");
		
	}

	@Override
	public void accelerate() {
		System.out.println("mmmmmmm");
		
	}

	@Override
	public void brake() {
		
		System.out.println("khuch khuch");
	}

}
