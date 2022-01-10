package com.te.customexception;

public class InvalidAgeException extends RuntimeException {
	InvalidAgeException (String msg){
		System.out.println(msg);
	}

}
