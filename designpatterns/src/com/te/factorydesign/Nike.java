package com.te.factorydesign;

public class Nike implements Company {

	@Override
	public void Tshirt() {
		System.out.println("nike brandTshirt");
		
	}

	@Override
	public void shoes() {
		System.out.println("nike sports shoes");
	}

	@Override
	public void jeans() {
		System.out.println("nike tight Tshirt");
		
	}

}
