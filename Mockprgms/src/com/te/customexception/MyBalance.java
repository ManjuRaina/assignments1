package com.te.customexception;

public class MyBalance extends RuntimeException {
String msg;

public MyBalance(String msg) {
	super(msg);
	
}

}
