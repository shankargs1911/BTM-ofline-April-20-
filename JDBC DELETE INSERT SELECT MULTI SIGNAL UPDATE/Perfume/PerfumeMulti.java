package com.xworkz.Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.bottle.constructor.DbProperty;

public class PerfumeMulti {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DbProperty.URL.getvalue(), DbProperty.USERNAME.getvalue(),
				DbProperty.PASSWORLD.getvalue());

		System.out.println(connection);

		String select = "SELECT * FROM lipstick.cigerrate";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println("resultset" + resultset);
		AtomicInteger atomic = new AtomicInteger(0);
		while (resultset.next()) {
			atomic.incrementAndGet();
			int id = resultset.getInt(1);
			String brand =resultset.getString(2);
			int price=resultset.getInt(3);
			int tobaco =resultset.getInt(4);
			String fleaver=resultset.getString(5);

			System.out.println(id + " " + brand + "  " + price + "   " + tobaco + "   " + fleaver);

		}
		System.out.println(atomic);
	}
}
