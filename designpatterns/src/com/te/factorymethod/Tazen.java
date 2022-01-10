package com.te.factorymethod;

public class Tazen implements Car {

	@Override
	public void start() {
		System.out.println("zuk zuk");
	}

	@Override
	public void accelerate() {
		System.out.println("zar zar");
		
	}

	@Override
	public void brake() {
		System.out.println("buck buck");
		
	}

}
