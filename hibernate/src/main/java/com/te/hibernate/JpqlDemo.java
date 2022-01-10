 package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {

	public static void main(String[] args) {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Manju");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	String query="from Team";
	
	 Query createQuery = createEntityManager.createQuery(query);
	List<Team> resultList = createQuery.getResultList();
	for (Team team : resultList) {
		System.out.println(team);
	}
	}
	

}
