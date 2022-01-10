package com.te.factorymethod;

public class Driver  {
	Car car;
	
	public void driver(String s) {
		if(s.equalsIgnoreCase("audi")) {
			car=new Audi();
			car.start();
			car.accelerate();
			car.brake();
			}
		if(s.equalsIgnoreCase("rollsroyce")) {
			car=new RollsRoyce();
			car=new Audi();
			car.start();
			car.accelerate();
			car.brake();
		}
		if(s.equalsIgnoreCase("tazen")) {
			car=new Tazen();
			car=new Audi();
			car.start();
			car.accelerate();
			car.brake();
		}
		
	}

}
