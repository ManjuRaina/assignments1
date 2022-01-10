package com.te.streamapi;

public class Product1 {
	int id;
	String name;
	float price;
	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "price=" + price + "]";
	}
	
	

}
