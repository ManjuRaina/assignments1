package com.tec.hasarealation;

public class Operating
 {
	String brand;
	double version;
	double bits;
	
	public Operating(String brand, double version, double bits) {
		super();
		this.brand = brand;
		this.version = version;
		this.bits = bits;
	}

	@Override
	public String toString() {
		return "Operating [brand=" + brand + ", version=" + version + ", bits=" + bits + "]";
	}
	}


