package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.constant.PartyName;
import com.xworkz.constant.PartySymbol;
import com.xworkz.dto.PoliticianDTO;

import static com.xworkz.constant.MySqlProperty.*;

public class PoliticianDAOImpl implements PoliticianDAO {

	@Override
	public Boolean saveDetails(PoliticianDTO dto) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String insert = "insert into politicians.politicians_info values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(insert);
			stmt.setInt(1, dto.getId());
			stmt.setString(2, dto.getName());
			stmt.setString(3, dto.getPartyName().getPartyName());
			stmt.setString(4, dto.getPresident());
			stmt.setInt(5, dto.getTotalMembers());
			stmt.setDouble(6, dto.getTotalBudget());
			stmt.setString(7, dto.getPartySymbol().getSymbol());
			stmt.setString(8, dto.getLocation());
			stmt.setString(9, dto.getHeadQuaters());

			int noOfRowsAffected = stmt.executeUpdate();
			if (noOfRowsAffected > 0) {
				System.out.println("The Values Inserted Are:" + insert);
			} else {
				System.out.println("Unable to save values");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO finfById(Integer id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String search = "select * from politicians.politicians_info where cid = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String pName = resultSet.getString(3);
				String president = resultSet.getString(4);
				Integer numberOfMenbers = resultSet.getInt(5);
				Double budget = resultSet.getDouble(6);
				String symbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String hQuaters = resultSet.getString(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(cid);
				politicianDTO.setName(name);
				politicianDTO.setPartyName(PartyName.getByParty(pName));
				politicianDTO.setPresident(president);
				politicianDTO.setTotalMembers(numberOfMenbers);
				politicianDTO.setTotalBudget(budget);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuaters(hQuaters);
				return politicianDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndPresident(Integer id, String president) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String search = "select * from politicians.politicians_info where cid = ? and president = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, president);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String pName = resultSet.getString(3);
				String president1 = resultSet.getString(4);
				Integer numberOfMenbers = resultSet.getInt(5);
				Double budget = resultSet.getDouble(6);
				String symbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String hQuaters = resultSet.getString(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();

				politicianDTO.setId(cid);
				politicianDTO.setName(name);
				politicianDTO.setPartyName(PartyName.getByParty(pName));
				politicianDTO.setPresident(president1);
				politicianDTO.setTotalMembers(numberOfMenbers);
				politicianDTO.setTotalBudget(budget);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuaters(hQuaters);
				return politicianDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndPresidentAndName(Integer id, String president, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String search = "select * from politicians.politicians_info where cid = ? and president = ? and politicianName = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, president);
			stmt.setString(3, name);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt(1);
				String pName = resultSet.getString(2);
				String prName = resultSet.getString(3);
				String president1 = resultSet.getString(4);
				Integer numberOfMenbers = resultSet.getInt(5);
				Double budget = resultSet.getDouble(6);
				String symbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String hQuaters = resultSet.getString(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setId(cid);
				politicianDTO.setName(pName);
				politicianDTO.setPartyName(PartyName.getByParty(prName));
				politicianDTO.setPresident(president1);
				politicianDTO.setTotalMembers(numberOfMenbers);
				politicianDTO.setTotalBudget(budget);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuaters(hQuaters);

				return politicianDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public PoliticianDTO findByIdAndName(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String search = "select * from politicians.politicians_info where cid = ? and politicianName = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt(1);
				String pName = resultSet.getString(2);
				String prName = resultSet.getString(3);
				String president = resultSet.getString(4);
				Integer numberOfMenbers = resultSet.getInt(5);
				Double budget = resultSet.getDouble(6);
				String symbol = resultSet.getString(7);
				String location = resultSet.getString(8);
				String hQuaters = resultSet.getString(9);

				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setId(cid);
				politicianDTO.setName(pName);
				politicianDTO.setPartyName(PartyName.getByParty(prName));
				politicianDTO.setPresident(president);
				politicianDTO.setTotalMembers(numberOfMenbers);
				politicianDTO.setTotalBudget(budget);
				politicianDTO.setPartySymbol(PartySymbol.getBySymbol(symbol));
				politicianDTO.setLocation(location);
				politicianDTO.setHeadQuaters(hQuaters);

				return politicianDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String findNameById(Integer id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String search = "select politicianName from politicians.politicians_info where " + "cid = " + id;
			java.sql.Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(search);
			while (resultSet.next()) {
				String name = resultSet.getString(1);
				return name;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findPresidentByIdAndName(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String search = "select president from politicians.politicians_info where cid = ? and politicianName = ?";
			PreparedStatement stmt = connection.prepareStatement(search);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				String president = resultSet.getString(4);
				PoliticianDTO politicianDTO = new PoliticianDTO();
				politicianDTO.setPresident(president);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int getTotal() {
		AtomicInteger atomicInteger = new AtomicInteger(0);
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query = "select * from politicians_info";
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet resultSet = stmt.executeQuery();
			while(resultSet.next()) {
			atomicInteger.incrementAndGet();	
			}
			System.out.println(atomicInteger);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public PoliticianDTO findPartyByMaxMembers() {
		return null;
	}

}
