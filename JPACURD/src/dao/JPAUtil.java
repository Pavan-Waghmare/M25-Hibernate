package org.tnsindia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	
	private static EntityManagerFactory f;
	private static EntityManager em;
	
	//static block is used to initialize the static data memvers
	static
	{
		f=Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=f.createEntityManager();
		}
		return em;
	}
	

}