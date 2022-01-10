 package com.tech.encapsulation;

public class Demo {
	private int age;
	private String name;

	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
		
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
		
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.setname("manju");
		demo.setage(20);
		System.out.println(demo.getname());
		System.out.println(demo.getage());
		
	}
	
	

}
