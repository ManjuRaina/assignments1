package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Manju");
		EntityManager createEntityManager = emf.createEntityManager();
		 Team player = createEntityManager.find(Team.class, 1);
        System.out.println(player);
        
      
	}

}
