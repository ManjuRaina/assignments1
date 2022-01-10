package com.tethreadUsinglambad;

public class Demo {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=1;i<=10;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		};
		Thread thread = new Thread(r);
		thread.start();
		
		
		
		Runnable r1=()->{
			for(int j=11;j<=20;j++) {
				System.out.println(j);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		};
		Thread thread1 = new Thread(r1);
		thread1.start();

	}

}
