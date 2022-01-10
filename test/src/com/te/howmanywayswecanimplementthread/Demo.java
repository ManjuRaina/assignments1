package com.te.howmanywayswecanimplementthread;

public class Demo implements Runnable {

	
		public void run() {
			System.out.println("thread is running");
			
		}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Thread thread = new Thread(demo);
		
		thread.start();
	}

}
