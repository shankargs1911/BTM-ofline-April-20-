package com.xworkz.resort;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.resort.entity.ResortEntity;

public class UnderstandingJPA {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("This is testing");
		EntityManager entityManager = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			System.out.println(entityManager.isOpen());

			EntityTransaction entityTransaction = entityManager.getTransaction();

			ResortEntity resortEntity = new ResortEntity();
			resortEntity.setId(3);
			resortEntity.setName("Rupees");
			resortEntity.setLocation("Mysore Road");
			resortEntity.setOwner("Kumaraswamy");
			resortEntity.setCheckInTime(LocalTime.of(12, 00));
			resortEntity.setCheckOutTime(LocalTime.of(11, 00));
			resortEntity.setCreatedBy("Om");
			resortEntity.setCreateDate(LocalDate.now());
			resortEntity.setPricePerDay(2000D);
			resortEntity.setUpdateDate(LocalDate.now());

			entityTransaction.begin();

			entityManager.persist(resortEntity);// sQL--->

			entityTransaction.commit(); // exuecte-->exception
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
