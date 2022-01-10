package com.te.hibernate.myhibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		
		Company company = new Company();
		company.setEmpId(10);
		company.setCompanyName("techno");
		
		Employee employee = new Employee();
		 employee.setEmpName("manju");
		 employee.setId(101);
		 
		 employee.setCompany(company);
		 company.setEmployee(employee);
		 
		 
		 
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("manju");
		 EntityManager em= emf.createEntityManager();
		 EntityTransaction transaction = em.getTransaction();
		 transaction.begin();
		 em.persist(employee);
		 em.persist(company);
		 transaction.commit();
	}

}
