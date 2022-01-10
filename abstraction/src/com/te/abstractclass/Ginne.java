package com.te.abstractclass;

public class Ginne extends Dog {

	public Ginne(double weight, int nails, String breed) {
		super(weight, nails, breed);
		
	}

	@Override
	void bark() {
		
		System.out.println("Bow Bow");
	}

	@Override
	void eat() {
	System.out.println(" pedigree and chicken");
		
	}

	@Override
	void bite() 
	{
		System.out.println(" it shows teeth");
		
	}

}
