package com.te.threadusinglambada;

public class Test {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(r);
		t1.start();

	}

}
