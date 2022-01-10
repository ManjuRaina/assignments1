package com.tech.arraylistcollection;



public class Emp implements Comparable<Emp>{
int id;
String name;
int sal;
public Emp(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal= sal;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "sal=" + sal + "]";
}
@Override
public int compareTo(Emp o) {
	
	return this.id-o.id;
}





    
	
}
