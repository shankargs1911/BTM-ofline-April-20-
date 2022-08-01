package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.xworkz.bottle.constructor.DbProperty;

public class LipstickSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DbProperty.URL.getvalue(), DbProperty.USERNAME.getvalue(),
				DbProperty.PASSWORLD.getvalue());

		System.out.println(connection);

		String select = "select * from lipstickinfo;";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println("resultset" + resultset);

		/*
		 * boolean rowExist= resultset.next(); System.out.println(rowExist);
		 * 
		 * if(rowExist==true) {
		 * 
		 * int lid=resultset.getInt(1); System.out.println(lid);
		 * 
		 * String brand=resultset.getString(2); System.out.println(brand);
		 * 
		 * 
		 * String type=resultset.getString(4); System.out.println(type);
		 * 
		 * double price=resultset.getDouble(5); System.out.println(price);
		 * 
		 * String size=resultset.getString(6); System.out.println(size); }else {
		 * System.err.println("data not found"); }
		 */
		AtomicInteger atomic = new AtomicInteger(0);
		while (resultset.next()) {
			atomic.incrementAndGet();
			int lid = resultset.getInt(1);
			String l_brand = resultset.getString(2);
			Double colour = resultset.getDouble(3);
			String type = resultset.getString(4);
			String price = resultset.getString(5);

			System.out.println(lid + " " + l_brand + "  " + colour + "   " + type + "   " + price);

		}
		System.out.println(atomic);
	}
}