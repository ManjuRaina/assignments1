package com.te.streamapi;

public class Demo {
  
	String name;
	float price;
	
	public Demo(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Demo [" + (name != null ? "name=" + name + ", " : "") + "price=" + price + "]";
	}
	
	
	

}
