package com.te.customexception1;

public class BelowAge extends RuntimeException{
	//parameterized constructor
		public BelowAge(String msg) {
			super(msg);
		}
}
