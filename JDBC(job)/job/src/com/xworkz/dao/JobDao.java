package com.xworkz.dao;

import com.xworkz.dto.JobDto;

public interface JobDao {
	boolean save(JobDto jobDTO);
	
	boolean isFresherByid(int id);
	
	double getmaxPercentage();

	JobDto findByID(int id);

	JobDto findbyidandDesignation(int id,String Designation);
	
	int getTotal();

	
	

}
