package com.te.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Jpql1Demo {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("Manju");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//		String query="from Team where designtion='batsman'";
//				Query createQuery = createEntityManager.createQuery(query);
//				List<Team> resultList = createQuery.getResultList();
//				for (Team team : resultList) {
//					System.out.println(team);
//				}
//	String query1="Select  min(salary)from Team";
//	
//Query createQuery2 = createEntityManager.createQuery(query1);
//Double singleResult = (Double)createQuery2.getSingleResult();
//System.out.println(singleResult);

//		EntityTransaction transaction = createEntityManager.getTransaction();
//        String query1="update Team set salary=150 where id=3";
    //  transaction.begin();
//        Query createQuery = createEntityManager.createQuery(query1);
//        int executeUpdate = createQuery.executeUpdate();
//        transaction.commit();
//        
               EntityTransaction transaction2 = createEntityManager.getTransaction();
               String query2=" update Team set salary=:sal where id=:od";
               transaction2.begin();
               Query createQuery2 = createEntityManager.createQuery(query2);
               createQuery2.setParameter("sal", 320.0);
               createQuery2.setParameter("od", 3);
               int executeUpdate2 = createQuery2.executeUpdate();
               transaction2.commit();

	}

}
