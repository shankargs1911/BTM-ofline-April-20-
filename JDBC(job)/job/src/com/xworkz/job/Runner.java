package com.xworkz.job;

import com.xworkz.constant.Designation;
import com.xworkz.constant.Qualification;
import com.xworkz.dao.JobDao;
import com.xworkz.dao.JobDaoimpl;
import com.xworkz.dto.JobDto;

public class Runner {
	public static void main(String[] args) {

		JobDto jobDTO = new JobDto();
		jobDTO.setJid(10);
		jobDTO.setDesignation(Designation.SOFTWAREDEVELOPER);
		jobDTO.setPackagee(900000);
		jobDTO.setQualification(Qualification.BCA);
		jobDTO.setPercentage(78);
		jobDTO.setFresher("yes");

		JobDto jobDTO2 = new JobDto();
		jobDTO.setJid(11);
		jobDTO.setDesignation(Designation.MANAGER);
		jobDTO.setPackagee(4500000);
		jobDTO.setQualification(Qualification.BCA);
		jobDTO.setPercentage(60);
		jobDTO.setFresher("yes");

		JobDto jobDto3 = new JobDto();
		jobDTO.setJid(12);
		jobDTO.setDesignation(Designation.SOFTWAREDEVELOPER);
		jobDTO.setPackagee(900000);
		jobDTO.setQualification(Qualification.BE);
		jobDTO.setPercentage(78);
		jobDTO.setFresher("Yes");

		JobDao dao = new JobDaoimpl();
		// dao.save(jobDTO);
		// dao.save(jobDTO2);
		// dao.save(jobDTO3);
		dao.findByID(1);
	}

}
