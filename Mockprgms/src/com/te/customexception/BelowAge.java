package com.te.customexception;

public class BelowAge extends RuntimeException {
String msg;

public BelowAge(String msg) {
	super(msg);
	
}

}
