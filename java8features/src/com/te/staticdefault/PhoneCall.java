package com.te.staticdefault;

public interface PhoneCall {
	void busyMessage();
	default void covidAlert() {
		System.out.println("Amithabh bachhan is speaking: stay safe");
	}
	

}
