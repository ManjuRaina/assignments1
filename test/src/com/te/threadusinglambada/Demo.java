package com.te.threadusinglambada;

public class Demo {
	public static void main(String[] args) {
		Thread th1 = new Thread(()->{
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + ",i=" + i);
			}
		});
		
		Thread th2 = new Thread(()->{
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + ",i=" + i);
			}
		});
		
		th1.start();
		th2.start();
		

	}

}
