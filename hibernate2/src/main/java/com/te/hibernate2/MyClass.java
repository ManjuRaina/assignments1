package com.te.hibernate2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {

	public static void main(String[] args) {
		
		
		Girl girl=new Girl();
		girl.setGid(1);
		girl.setName("ash");
		
		Boy boy = new Boy();
		boy.setBid(101);
		boy.setBalance(1000);
		boy.setName("abhishek");
		
		girl.setBoy(boy);
		boy.setGirl(girl);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manju");
		  EntityManager em = emf.createEntityManager();
		  EntityTransaction transaction  = em.getTransaction();
		  transaction.begin();
		  em.persist(boy);
		  em.persist(girl);
		  transaction.commit();
	}

}
