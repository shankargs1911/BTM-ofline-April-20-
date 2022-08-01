package com.xworkz.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.bottle.constructor.DbProperty;

public class CigerateMulti {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DbProperty.URL.getvalue(), DbProperty.USERNAME.getvalue(),
				DbProperty.PASSWORLD.getvalue());

		System.out.println(connection);

		String select = "SELECT * FROM lipstick.perfumeinfo";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println("resultset" + resultset);
		AtomicInteger atomic = new AtomicInteger(0);
		while (resultset.next()) {
			atomic.incrementAndGet();
			int id = resultset.getInt(1);
			int price=resultset.getInt(2);
			String brand =resultset.getString(3);
			String Fragrance=resultset.getString(4);
			String Quality =resultset.getString(5);

			System.out.println(id + " " + brand + "  " + price + "   " + Fragrance + "   " + Quality);

		}
		System.out.println(atomic);
	}
}
