package com.te.defaultjava8;

public interface Test {
	void m1();
	
	default void message() {
		System.out.println("i got the  messages");
	}

}
