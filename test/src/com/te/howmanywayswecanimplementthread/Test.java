package com.te.howmanywayswecanimplementthread;
// 1st extends thread
public class Test extends Thread{
	public void run() {
		System.out.println("thread is runing ");
		
	}


	public static void main(String[] args) {
		Test t=new Test();
		t.start();
	
	}

}
