package com.xworkz.Jet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class JetDAOImpl implements JetDAO {

	private EntityManagerFactory Factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(JetDAO entity) {
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager manager = factory.createEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			factory.close();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return false;
	}

}
