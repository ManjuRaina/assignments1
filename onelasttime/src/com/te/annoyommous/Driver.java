package com.te.annoyommous;

public class Driver {

	public static void main(String[] args) {

		Car c = new Car() {
			public void add() {
				System.out.println("car drives");
			}

		};
		c.add();
	}
}
