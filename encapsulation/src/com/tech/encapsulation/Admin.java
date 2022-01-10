package com.tech.encapsulation;

public class Admin 
{
	public static void main(String[] args) {
		 Employee e1=new Employee();
		 e1.setempId(1);
		 e1.setAge(19);
		 e1.setName("raju");
		 e1.setDesignation("Software engineer");
		 Employee e2=new Employee();
		 e2.setempId(2);
		 e2.setAge(23);
		 e2.setName("ravi");
		 e2.setDesignation("Tech lead");
		 
		 e2.getAge();
		 e2.getdesignation();
		 e2.getname();
		 e2.getempId();;
		 e1.getAge();
		 e1.getdesignation();
		 e1.getempId();
		 e1.getname();
		 
		 
	}

}
