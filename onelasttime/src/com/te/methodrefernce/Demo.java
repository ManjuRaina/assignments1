package com.te.methodrefernce;

public class Demo {

	public static void main(String[] args) {
		Drawable d=new Test()::draw;
		d.draw();

	}

}
