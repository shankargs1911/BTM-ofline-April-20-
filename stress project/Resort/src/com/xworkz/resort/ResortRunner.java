package com.xworkz.resort;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {
	public static void main(String[] args) {

		// Create the Entity
		ResortEntity resortEntity = new ResortEntity();
		resortEntity.setId(3);
		resortEntity.setName("Mango resort");
		resortEntity.setLocation("tumkur Road");
		resortEntity.setOwner("shankar");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOutTime(LocalTime.of(11, 00));
		resortEntity.setCreatedBy("gs");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setPricePerDay(2000D);
		resortEntity.setUpdateDate(LocalDate.now());
		// Create dao
		ResortDAO dao = new ResortDAOImpl();
		boolean saved = dao.save(resortEntity);
		System.out.println("Saved " + saved);
	}
}
