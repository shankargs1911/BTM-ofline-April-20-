package com.xworkz.bar;

import com.xworkz.bar.constants.Bartype;
import com.xworkz.bar.dao.BarDao;
import com.xworkz.bar.dao.BarDaoimpl;
import com.xworkz.bar.dto.BarDto;

public class Runner {
	public static void main(String[] args) {
		BarDto dto = new BarDto(2, "raj", "jp_nagar", Bartype.RESORT, 100.0d, 200.00);
		BarDao barDao = new BarDaoimpl();
		barDao.save(dto);
	}
}
