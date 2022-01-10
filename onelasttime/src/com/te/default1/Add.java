package com.te.default1;

public interface Add {
	void m1();
	
	public default void run() {
		System.out.println("running add method");
	}

}
