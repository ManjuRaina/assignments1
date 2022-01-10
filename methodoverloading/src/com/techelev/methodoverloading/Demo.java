package com.techelev.methodoverloading;

// method overloading with number of different argumentes
public class Demo {

	public void login(String username, String password) {
		System.out.println("your username is" + username);
		System.out.println("your password " + password);
	}

	public void login(String password, long phonenumber) {
		System.out.println("your password " + password);
		System.out.println("your phonenumber is" + phonenumber);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.login("Manju@", 9353214549l);
		d.login("Manju", "Manju@");
	}

}
