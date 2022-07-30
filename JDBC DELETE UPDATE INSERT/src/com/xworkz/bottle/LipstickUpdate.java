package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);

		// String update="update lipstickinfo set price=1000 where id=5;";
		// String update="update lipstickinfo set price=500 where id=2;";
		// String update="update lipstickinfo set price=300 where id=3;";
		// String update="update lipstickinfo set price=400 where id=4;";
		// String update="update lipstickinfo set price=600 where id=6;";
		// String update="update lipstickinfo set price=700 where id=7;";
		// String update="update lipstickinfo set price=800 where id=8;";
		// String update="update lipstickinfo set price=900 where id=9;";
		String update = "update lipstickinfo set price=100 where id=10;";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(update);
		System.out.println("affected" + affected);
	}

}
