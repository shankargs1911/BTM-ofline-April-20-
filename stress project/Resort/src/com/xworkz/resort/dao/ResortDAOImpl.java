package com.xworkz.resort.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.resort.entity.ResortEntity;

public class ResortDAOImpl implements ResortDAO {

	private EntityManagerFactory Factory = Persistence.createEntityManagerFactory("com.xworkz");

	@Override
	public boolean save(ResortEntity entity) {
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
		return true;
	}

	@Override
	public ResortEntity findById(int pk) {
		System.out.println("running findById" + pk);
		// look for .xml --> parsing --> impl of EMF
		// EMF --> establish ---> connection pool
		EntityManager entityManager = null;
		try {
			entityManager = Factory.createEntityManager();
			// create an impl of EM --> assoc a conn from CP
			ResortEntity entity = entityManager.find(ResortEntity.class, pk);
			if (entity != null) {
				System.out.println("resort entity is found for id" + pk);
				return entity;
			} else {
				System.err.println("resort entity is not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}

		return null;
	}

	@Override
	public void updateOwnerAndLocationById(String newOwner, String newLocation, int id) {
		EntityManager entityManager = this.Factory.createEntityManager();
		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			ResortEntity entity = entityManager.find(ResortEntity.class, id);
			if (entity != null) {
				System.out.println("entity found for id" + id + " can update");
				entity.setOwner(newOwner);
				entity.setLocation(newLocation);
				entityManager.merge(entity);// update sql
			}
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			entityManager.close();
		}
	}

}
