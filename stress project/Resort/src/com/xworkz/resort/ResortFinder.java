package com.xworkz.resort;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortFinder {
	public static void main(String[] args) {

		ResortDAO dao = new ResortDAOImpl();
		ResortEntity entity = dao.findById(20);
		System.out.println(entity);
dao.updateOwnerAndLocationById("Shankar", "DVG", 1);
	}

}
