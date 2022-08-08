package com.xworkz.runner;

import java.awt.List;

import com.xworkz.constant.Model;
import com.xworkz.dao.CarDAO;
import com.xworkz.dao.CarDAOimpl;
import com.xworkz.dto.CarDTO;

public class Runner {
	public static void main(String[] args) {
		CarDTO carDTO = new CarDTO(1, "BMW", Model.DEFAULT, 20, "BNG");
		CarDTO carDTO1 = new CarDTO(2, "banze", Model.Maruti_Dzire, 30, "BNG");
		CarDTO carDTO2 = new CarDTO(3, "audi", Model.Tata_Harrier, 60, "BNG");
		CarDTO carDTO3 = new CarDTO(4, "lamber", Model.Toyota_Fortuner, 90, "BNG");
		CarDTO carDTO4 = new CarDTO(5, "skoda", Model.Maruti_Dzire, 120, "BNG");
		CarDTO carDTO5 = new CarDTO(6, "skoda", Model.Maruti_Dzire, 180, "BGN");
		CarDTO carDTO6 = new CarDTO(7, "fortunear", Model.Maruti_Dzire, 180, "BGN");

		CarDAO carDAO = new CarDAOimpl();
//		carDAO.savedetails(carDTO);
//		carDAO.savedetails(carDTO1);
//		carDAO.savedetails(carDTO2);
//		carDAO.savedetails(carDTO3);
//		carDAO.savedetails(carDTO4);
//	    carDAO.savedetails(carDTO5);
//		CarDTO get = carDAO.finfById(1);
//		System.out.println(get);

		CarDTO car = carDAO.findByIdAndCar(2, "banze");
		System.out.println(car);

		CarDTO car1 = carDAO.findByIdAndCarAndName(3, "Tata harrier", "audi");
		System.out.println(car1);

		CarDTO car2 = carDAO.findByIdAndCarAndName(4, "toyota fortuner", "lamber");
		System.out.println(car2);

		CarDTO name = carDAO.findByIdAndName(5, "skoda");
		System.out.println(name);

		String name2 = carDAO.findCarByIdAndName(6, "skoda");
		System.out.println(name2);

		carDAO.getTotal();

		String max = carDAO.findPartyByMaxMembers();
		System.out.println(max);

		java.util.List<CarDTO> list = carDAO.findByIdAndName(1, "BMW");
		System.out.println(list);
		
	}
}
