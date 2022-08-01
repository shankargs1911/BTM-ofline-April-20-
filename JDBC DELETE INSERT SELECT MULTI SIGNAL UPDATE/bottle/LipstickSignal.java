package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constructor.DbProperty;

public class LipstickSignal {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DbProperty.URL.getvalue(), DbProperty.USERNAME.getvalue(),
				DbProperty.PASSWORLD.getvalue());

		System.out.println(connection);

		String select = "select * from lipstickinfo";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println("resultset" + resultset);

		boolean rowExist = resultset.next();
		System.out.println(rowExist);

		if (rowExist == true) {

			int lid = resultset.getInt(1);
			System.out.println(lid);

			String brand = resultset.getString(2);
			System.out.println(brand);

			String type = resultset.getString(4);
			System.out.println(type);

			double price = resultset.getDouble(3);
			System.out.println(price);

			String size = resultset.getString(5);
			System.out.println(size);
		} else {
			System.err.println("data not found");
		}
	}
}
