package com.te.abstractionprgm;

public class Fan extends Switch {

	@Override
	void switchOn() {
	System.out.println("Fan starts rotating");	
		
	}

	@Override
	void switchoff() {
		 
		System.out.println("Fan stops rotating");	
	}
	
	

}
