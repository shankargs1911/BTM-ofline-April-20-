package com.xworkz.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CegerateUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);

		String update = "update perfumeinfo set price=900 where price=250;";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(update);
		System.out.println("affected" + affected);

	}

}
