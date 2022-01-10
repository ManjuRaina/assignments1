package com.te.abstractionprgm;

public class Tv  extends  Switch{

	@Override
	void switchOn() {
		
		System.out.println("tv turns on");
	}

	@Override
	void switchoff() {
		
		System.out.println("Tv turns off");
	}
	

}
