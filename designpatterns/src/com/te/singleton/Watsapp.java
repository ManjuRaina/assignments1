package com.te.singleton;

public class Watsapp {
	// final static  Whatsapp watsapp=new Watsapp();
	
	// private Watsapp(){
//} 
private static Watsapp watsapp;
	
	private Watsapp() {
		
	}
	static Watsapp helperMethod() {
		if(watsapp==null) {
			watsapp=new Watsapp();
			return watsapp;
		}
		return watsapp;
	}

}
