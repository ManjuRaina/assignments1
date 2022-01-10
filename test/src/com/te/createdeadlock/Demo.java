package com.te.createdeadlock;

public class Demo extends Thread {
	@Override
	public void run() {
		
		for(int i=6;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}
