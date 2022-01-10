 package com.te.lambdaexpression;

public class MyClass {
	public static void main(String[] args) {
		//annoymous
		Test test=new Test() { 
		@Override
		public  void message() {
			System.out.println(" Namaste Guys");
		}
		};
  test.message();
  
  System.out.println("===========");
  //lambda expression
  Test test1=()->{
	 System.out.println("vannakaum"); 
  };
  test1.message();
}
}
