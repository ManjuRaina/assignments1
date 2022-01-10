package com.te.lambdaexpression;

public class MyClass1 {
	
	int sum(int x,int y) {
		System.out.println("summing numbers");
		return x+y;
		
	}

	public static void main(String[] args) {
		 // lambad expression 
		//Test1 test1=(i,j)->{
		//	return i+j;
	//	};
	 // int add1=test1.add(10,20);\ 
	//=====================================	
 //Runnable run=()->{
//	 for(int i=0;i<5;i++) {
		// System.out.println(i);
	// }
// };
// Thread thread = new Thread(run);
// thread.start();
	//=============================================	 
	/// method reference
		Test1 test=new MyClass1()::sum;
	System.out.println(test.add(10,20));
		 
	}

}
