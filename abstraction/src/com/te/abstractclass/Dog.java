  package com.te.abstractclass;

public abstract class Dog
{
	double weight;
	int nails;
	String breed;
	public Dog(double weight, int nails,String breed)
	{
		this.weight=weight;
		this.nails=nails;
		this.breed=breed;
	}
	abstract void bark();
	abstract void eat();
	abstract void bite();
	public void poop()
	{
		System.out.println(" it is pooping");
	}

}
