package com.te.thread;

public class Test extends Thread{

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
		for(int j=1;j<=5;j++) {
			System.out.println(j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			};
		}
		

	}

}
