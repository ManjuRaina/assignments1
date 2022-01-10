package com.te.abstractclass;

public class Rocky extends Dog {

	public Rocky(double weight, int nails, String breed) {
		super(weight, nails, breed);
	
	}

	@Override
	void bark() {
	
		System.out.println(" Ba  Ba");
	}

	@Override
	void eat() 
	{
	System.out.println(" Roti and milk");	
	}

	@Override
	void bite() 
	{
      System.out.println(" it never bits but has sharp teeth");
		
	}
	

}
