package com.te.string;

public class Test {

	public static void main(String[] args) {
		String name="my name is praveen";//string s=new String("HEMANTH")
		name=name.toUpperCase();           // String s1=new String("HEMANTH");
		//System.out.println(name.length()); //System.out.println(s.equals(s1);
	//	System.out.println(name); //System.out.println(s==s1);//         
		String[] s=name.split(" ",4);// just to delete space ("") of string in arry
		for(String x :s)
		{
			System.out.println(x);
		}
	}

}
