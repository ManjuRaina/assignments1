  package com.te.hasarelationship;

public class Test {

	public static void main(String[] args) {
		
 
		Adress a=new Adress("india","karnataka","ganagavthi");

		
		Emp e=new Emp(101,"manju",a);
		System.out.println(e.a.country);
		System.out.println(e.a.state);
		System.out.println(e.a .city);
		
		System.out.println(e.id+" "+e.name);
		
		
		
	}

}
