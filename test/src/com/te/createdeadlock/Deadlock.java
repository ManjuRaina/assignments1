package com.te.createdeadlock;

public class Deadlock {

	public static void main(String[] args) throws InterruptedException {
		String obj1 = "object1";
		String obj2 = "object2";

		Thread t1 = new Thread() {

			public void run() {

				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName() + "is holding" + obj1);

				}

				System.out.println(Thread.currentThread().getName() + "is waiting" + obj2);

				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName() + "is holding" + obj2);

				}

			}

		};
		
		Thread t2 = new Thread() {

			public void run() {

				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName() + "is holding" + obj2);

				}

				System.out.println(Thread.currentThread().getName() + "is waiting" + obj1);

				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName() + "is holding" + obj1);

				}

			}

		};
		t1.start();
		t1.join();
		t2.start();
		

	}

}
