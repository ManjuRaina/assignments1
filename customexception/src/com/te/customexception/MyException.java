package com.te.customexception;

public class MyException extends Throwable {
	String str1;
	 MyException(String str2){
		 this.str1=str2;
	 }
	@Override
	public String toString() {
		return "MyException [" + (str1 != null ? "str1 =" + str1 : "") + "]";
	}
	 

}
