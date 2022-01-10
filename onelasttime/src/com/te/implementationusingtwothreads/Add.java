package com.te.implementationusingtwothreads;

public class Add  extends Thread{
	@Override
	public void run() {
		System.out.println("run method is running");
	}

	public static void main(String[] args) {
		
		Add add = new Add();
		 add.start();

	}

}
