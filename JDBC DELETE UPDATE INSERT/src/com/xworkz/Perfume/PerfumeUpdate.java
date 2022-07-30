package com.xworkz.Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);

		String update = "update cigerrate set price=8 where price=7;";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(update);
		System.out.println("affected" + affected);


	}

}
