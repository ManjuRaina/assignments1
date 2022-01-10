package com.te.hibernate4;



 import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {

	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setGid(3);
		girl.setName("ash");
		
		Boy boy = new Boy();
		 boy.setBid(114);
		 boy.setName("abhishek");
		 boy.setBalance(1000000);
		 
		 Boy boy1 = new Boy();
		 boy1.setBid(115);
		 boy1.setName("manju");
		 boy1.setBalance(10000);
		 
		 Boy boy2 = new Boy();
		 boy2.setBid(116);
		 boy2.setName("malli");
		 boy2.setBalance(1000);
		 
		 List<Boy> asList = Arrays.asList(boy,boy1,boy2);
		 girl.setBoys(asList);
		 
		 boy.setGirl(girl);
		 boy1.setGirl(girl);
		 boy2.setGirl(girl);
		 
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("manju");
		  EntityManager em = emf.createEntityManager();
		  EntityTransaction transaction  = em.getTransaction();
		  transaction.begin();
		  em.persist(boy);
		  em.persist(boy1);
		  em.persist(boy2);
		  em.persist(girl);
		  transaction.commit();
	}

}
