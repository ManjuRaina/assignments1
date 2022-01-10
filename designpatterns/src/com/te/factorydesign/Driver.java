package com.te.factorydesign;

public class Driver {
	Company company;
	
	public void driver(String s) {
		if(s.equalsIgnoreCase("Puma")) {
			company=new Puma();
			company.Tshirt();
			company.shoes();
			company.jeans();
		}
		if(s.equalsIgnoreCase("Nike")) {
			company=new Nike();
			company.Tshirt();
			company.shoes();
			company.jeans();
		}
		if(s.equalsIgnoreCase("PeterGland")) {
			company=new PeterGland();
			company.Tshirt();
			company.shoes();
			company.jeans();
		}
		
	}

}
