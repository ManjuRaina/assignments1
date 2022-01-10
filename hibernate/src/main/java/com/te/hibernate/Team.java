 package com.te.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int id;
	private String name;
	private double salary;
	private String designtion;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	 
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDesigntion() {
		return designtion;
	}
	
	public void setDesigntion(String designtion) {
		this.designtion = designtion;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "salary=" + salary + ", "
				+ (designtion != null ? "designtion=" + designtion : "") + "]";
	}
	

}
