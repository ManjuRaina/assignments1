package com.te.implementationusingtwothreads;

public class Test implements Runnable {
	@Override
	public void run() {
		System.out.println("my thread is running");

	}

	public static void main(String[] args) {
		Test test = new Test();
		Thread thread = new Thread(test);
		 thread.start();

	}

}
