package com.te.factorydesign;

public class Puma  implements Company{

	@Override
	public void Tshirt() {
		
		System.out.println("puma quality Tshirt");
	}

	@Override
	public void shoes() {
		
		System.out.println("puma sports shoes");
	}

	@Override
	public void jeans() {
		System.out.println("puma tight jeans");
		
	}

}
