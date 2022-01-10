package com.te.factorymethod;

public class RollsRoyce  implements Car{

	@Override
	public void start() {
		System.out.println("zur zur");
		
	}

	@Override
	public void accelerate() {
		System.out.println("huz huz");
		
	}

	@Override
	public void brake() {
		System.out.println(" baka baka");
		
	}

}
