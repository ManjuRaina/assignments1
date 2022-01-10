package com.te.customexception;



public class MyClass {

	public static void main(String[] args) {
		try{
			
			vote(10);
		}
		catch(Exception e){
			
			System.out.println(e);
		}
	
		}
	public static void vote(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("not eligible to vote");
		}else {
			System.out.println("eligible to vote");
		}
	}

}
