package com.te.typecasting;

public class DataWidening {

	public static void main(String[] args) {
	byte b=100;
	short s=300;
	int i=4500;
	long l=112345678l;
	float f=12.08f;
	double d=128.4556d;
	
	 short s1[]= {b,s};
	 int [] i2= {b,s,i};
	 long []l1= {b,s,i,l};
	 float []f1= {b,s,i,l,f};
	 double []d1= {b,s,i,f,d};
	 
	 for(int x=0;x<d1.length;x++) {
		 System.out.println(d1[x]);
	 }
	 
	 
	 
	 
	 
	
	
	
	

	}

}
