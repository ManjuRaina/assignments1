package com.te.threadusinglambada;

public class Test {

	public static void main(String[] args) {

		Runnable r = () -> {

			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(i);

			}

		};
		Thread t = new Thread(r);

		t.start();

		Runnable r1 = () -> {

			for (int j = 11; j <= 20; j++) {
				try {
					Thread.sleep(1050);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(j);

			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}