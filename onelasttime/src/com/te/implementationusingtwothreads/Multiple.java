package com.te.implementationusingtwothreads;

public class Multiple implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running");
		
	}


	public static void main(String[] args) {
		Multiple multiple = new Multiple();
		Thread t=new Thread( multiple);
		t.start();
	

	}

	
}
