package com.te.singleton;

public class User {
	public static void main(String[] args) {
		
		//System.out.println(Wsatsapp.Watsapp);
		
		Watsapp u1 = Watsapp.helperMethod();
		System.out.println(u1);
		
		Watsapp u2 = Watsapp.helperMethod();
		System.out.println(u2);

	}

}
