package com.te.lambad;

public class Demo {

	public static void main(String[] args) {
       int width=10;
       
       Drawable d=()->{
    	   System.out.println("drawing "+width);
       };
       d.draw();

	}

}
