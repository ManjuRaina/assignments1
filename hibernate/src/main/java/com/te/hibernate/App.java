package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Team player1 = new Team();
		player1.setId(1);
		player1.setName("MS DHONI");
		player1.setSalary(10000);
		player1.setDesigntion("Captain");

		Team player2 = new Team();
		player2.setId(2);
		player2.setName("virat kohli");
		player2.setSalary(100);
		player2.setDesigntion("ViceCaptain");
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Manju");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction transaction = em.getTransaction();		
		
		transaction.begin();
		em.persist(player1);
		em.persist(player2);
		transaction.commit();
////	Team vk = em.find(Team.class, 2);
//		transaction.begin();
//		em.remove(vk);
// 	transaction.commit();


 Team kl = em.find(Team.class, 2);
 if (kl != null) {
	 kl.setDesigntion("vc");
	 kl.setName("Kl"); transaction.begin(); 
	  transaction.commit();
	 System.out.println("update");
		 

	}
}
}