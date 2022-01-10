package com.te.abstractclass;

public class Owner {

	public static void main(String[] args)
	{ 
		Rocky r=new Rocky(60.0,20,"leaporad");
		r.bark();
		r.bite();
		r.poop();
		r.eat();
		System.out.println(" weight " + "nails " + " breed");
		 
		System.out.println("==============");
		Ginne g=new Ginne(100.0,2, "rockey");
		g.bark();
		g.bite();
		g.eat();
		g.poop();
		
		
		

	}

}
