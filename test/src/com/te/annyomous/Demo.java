package com.te.annyomous;

public class Demo {

	public static void main(String[] args) {
		Drawable d=new Drawable() {
			
			@Override
			public void draw() {
				
				System.out.println("drawing");
			}
		};
		d.draw();

	}

}
