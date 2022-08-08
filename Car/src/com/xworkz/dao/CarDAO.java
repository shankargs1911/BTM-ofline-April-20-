package com.xworkz.dao;

import com.xworkz.dto.CarDTO;

public interface CarDAO {
	public Boolean savedetails(CarDTO carDTO);

	public CarDTO finfById(Integer id);

	public CarDTO findByIdAndCar(Integer id, String name);

	public CarDTO findByIdAndCarAndName(Integer id, String president, String name);

	public CarDTO findByIdAndName(Integer id, String name);

	public CarDTO findNameById(Integer id);

	public String findCarByIdAndName(Integer id, String name);

	public int getTotal();

	public String findPartyByMaxMembers();

}
