package com.te.factorydesign;

public class PeterGland  implements Company{

	@Override
	public void Tshirt() {
		
		System.out.println(" PeterGland  quality Tshirt");	
	}

	@Override
	public void shoes() {
		
		System.out.println(" PeterGland  sports shoes");
	}

	@Override
	public void jeans() {
		System.out.println(" PeterGland  tights Tshirt");
	}

}
