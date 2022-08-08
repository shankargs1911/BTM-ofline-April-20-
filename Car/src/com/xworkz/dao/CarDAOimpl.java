package com.xworkz.dao;

import static com.xworkz.constant.MySqlProperty.SECRET;
import static com.xworkz.constant.MySqlProperty.URL;
import static com.xworkz.constant.MySqlProperty.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.constant.Model;
import com.xworkz.dto.CarDTO;

public class CarDAOimpl implements CarDAO {

	@Override
	public Boolean savedetails(CarDTO carDTO) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insertSql = "insert into car.car_info value(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSql);
			statement.setInt(1, carDTO.getCid());
			statement.setString(2, carDTO.getName());
			statement.setString(3, carDTO.getModel().getModel());
			statement.setInt(4, carDTO.getSpeed());
			statement.setString(5, carDTO.getRegistra());
			int rowsAffected = statement.executeUpdate();

			System.out.println(rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CarDTO finfById(Integer id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "Select * From car.car_info where Cid=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {

				int id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String model = resultSet.getString(3);
				int speed = resultSet.getInt(4);
				String registration = resultSet.getString(5);
				CarDTO carDTO = new CarDTO();
				carDTO.setCid(id1);
				carDTO.setName(name);
				carDTO.setModel(Model.getByValue(model));
				carDTO.setSpeed(speed);
				carDTO.setRegistra(registration);
				return carDTO;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public CarDTO findByIdAndCar(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "SELECT * FROM car_info where Cid=? and name=?";
			PreparedStatement statement = connection.prepareStatement(selectSql);
			statement.setInt(1, id);
			statement.setString(2, name);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String model = resultSet.getString(3);
				int speed = resultSet.getInt(4);
				String registration = resultSet.getString(5);
				CarDTO carDTO = new CarDTO();
				carDTO.setCid(id1);
				carDTO.setName(name1);
				carDTO.setModel(Model.getByValue(model));
				carDTO.setSpeed(speed);
				carDTO.setRegistra(registration);
				return carDTO;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CarDTO findByIdAndCarAndName(Integer id, String president, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "Select * from car_info where Cid=? and Model=? and name=?";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			statament.setInt(1, id);
			statament.setString(2, president);
			statament.setString(3, name);
			ResultSet resultSet = statament.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String model = resultSet.getString(3);
				int Speed = resultSet.getInt(4);
				String registration = resultSet.getString(5);
				CarDTO carDTO = new CarDTO();
				carDTO.setCid(id1);
				carDTO.setName(name1);
				carDTO.setModel(Model.getByValue(model));
				carDTO.setSpeed(id1);
				carDTO.setRegistra(registration);
				return carDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public CarDTO findByIdAndName(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "Select * from car_info where Cid=? and name=?";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			statament.setInt(1, id);
			statament.setString(2, name);
			ResultSet resultSet = statament.executeQuery();
			while (resultSet.next()) {
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String model = resultSet.getString(3);

				int Speed = resultSet.getInt(4);
				String registration = resultSet.getString(5);

				CarDTO carDTO = new CarDTO();

				carDTO.setCid(id1);
				carDTO.setName(name1);
				carDTO.setModel(Model.getByValue(model));
				carDTO.setSpeed(id1);
				carDTO.setRegistra(registration);

				return carDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CarDTO findNameById(Integer id) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "Select  name From car_info where Cid= ? ";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			statament.setInt(1, id);
			ResultSet resultSet = statament.executeQuery();
			while (resultSet.next()) {
				String name = resultSet.getString(1);
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String model = resultSet.getString(3);
				int Speed = resultSet.getInt(4);
				String registration = resultSet.getString(5);

				CarDTO carDTO = new CarDTO();

				carDTO.setCid(id1);
				carDTO.setName(name1);
				carDTO.setModel(Model.valueOf(model));
				carDTO.setSpeed(id1);
				carDTO.setRegistra(registration);

				return carDTO;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findCarByIdAndName(Integer id, String name) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "SELECT * FROM car_info where Cid=? and name=?";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			statament.setInt(1, id);
			statament.setString(2, name);
			ResultSet resultSet = statament.executeQuery();
			
			while (resultSet.next()) {
				String Car = resultSet.getString(1);
				int id1 = resultSet.getInt(1);
				String name1 = resultSet.getString(2);
				String model = resultSet.getString(3);
				int Speed = resultSet.getInt(4);
				String registration = resultSet.getString(5);

				CarDTO carDTO = new CarDTO();

				carDTO.setCid(id1);
				carDTO.setName(name1);
				carDTO.setModel(Model.getByValue(model));
				carDTO.setSpeed(id1);
				carDTO.setRegistra(registration);

				return Car;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getTotal() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String SelectSql = "Select * from car_info";
			PreparedStatement statament = connection.prepareStatement(SelectSql);
			ResultSet resultSet = statament.executeQuery();
			AtomicInteger atomatic = new AtomicInteger();
			while (resultSet.next()) {
				atomatic.incrementAndGet();
			}
			System.out.println(atomatic.get());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String findPartyByMaxMembers() {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {
			String selectSql = "select name , Max(Speed)from car.car_info;";
			PreparedStatement statament = connection.prepareStatement(selectSql);
			ResultSet resultSet = statament.executeQuery();
			while (resultSet.next()) {
				String max = resultSet.getString(1);
				return max;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
