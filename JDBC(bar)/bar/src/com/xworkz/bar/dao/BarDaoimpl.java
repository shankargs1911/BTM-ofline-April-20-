package com.xworkz.bar.dao;

import java.net.URL;
import java.net.UnknownServiceException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.callback.UsernameCallback;
import com.mysql.cj.xdevapi.Statement;
import com.xworkz.bar.dto.BarDto;

import static com.xworkz.bar.constants.MysqlProperties.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BarDaoimpl implements BarDao {

	@Override
	public Boolean save(BarDto barDto) {
		try (Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(),
				SECRET.getValue())) {

			String insert = "Insert into new_table values(" + barDto.getId() + ",'" + barDto.getName() + "','"
					+ barDto.getLocation() + "','" + barDto.getType().getName() + "'," + barDto.getAvgcollectionPerDay()
					+ "," + barDto.getCollectionPerMonth() + ")";
			java.sql.Statement statement = connection.createStatement();
			int rowsAffected = statement.executeUpdate(insert);
			if (rowsAffected > 0) {
				System.out.println("Data found :" + insert);
				return true;
			} else {
				System.out.println("Data not found");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
