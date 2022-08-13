package com.xworkz.Jets;

import com.xworkz.Jet.dao.JetDAO;
import com.xworkz.Jet.dao.JetDAOImpl;
import com.xworkz.Jet.entity.JetEntity;

public class JetRunner {
public static void main(String[] args) {
	JetEntity jetEntity = new JetEntity();
	jetEntity.setId(1);
	jetEntity.setOwner("shankar");
	jetEntity.setLocation("davangere");
	jetEntity.setCreatedBy("gss");
	jetEntity.setPrice(1000000d);
	
	//create dao
	JetDAO dao = new JetDAOImpl();
	boolean save = dao.save(dao);
	System.out.println("save" + save);
			}
}
