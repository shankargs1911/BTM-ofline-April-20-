package com.xworkz.dao;

import com.xworkz.dto.PoliticianDTO;

public interface PoliticianDAO {
	public Boolean saveDetails(PoliticianDTO dto);
	public PoliticianDTO finfById(Integer id);
	public PoliticianDTO findByIdAndPresident(Integer id,String president);
	public PoliticianDTO findByIdAndPresidentAndName(Integer id,String president,String name);
	public PoliticianDTO findByIdAndName(Integer id, String name);
	public String findNameById(Integer id);
	public String findPresidentByIdAndName(Integer id,String name);
	public int getTotal();
	public PoliticianDTO findPartyByMaxMembers();
}
