package com.te.upanddowncasting;

public class App {

	public static void main(String[] args) {
		
		//upcasting
		Machine machine1=new Camera();
		machine1.start();
		
		System.out.println("===============");
		
		//downcasting
		Camera camera1=(Camera)machine1;
		camera1.snap();
		camera1.start();

	}


}
