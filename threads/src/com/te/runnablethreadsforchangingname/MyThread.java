package com.te.runnablethreadsforchangingname;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("the name of the current thread is"+Thread.currentThread());
		
	}

}
