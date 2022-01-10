package com.te.abstractclass;

public class Zoey extends Dog
{
 public Zoey(double weight, int nails, String breed) {
		super(weight, nails, breed);
		
	}

@Override
	void bark() {
		
		System.out.println(" Bow Bow");
	}

	@Override
	void eat() {
		System.out.println(" curd rice with milk ");
		
	}

	@Override
	void bite() {
		
		System.out.println(" no biting process");
	}
	
  }
