package com.te.default1;

public interface Demo {
	void run();
	
	public default void add() {
		System.out.println("adding the numbers");
	}

}
