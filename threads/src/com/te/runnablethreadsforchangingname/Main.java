package com.te.runnablethreadsforchangingname;

public class Main {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread currentThread = Thread.currentThread();
		System.out.println();
		currentThread.setName("chotta Bheem");
		System.out.println(" ");
		Thread thread=new Thread(myThread);
        thread.setName("chutki");
        thread.start();
        
		
	}

}
