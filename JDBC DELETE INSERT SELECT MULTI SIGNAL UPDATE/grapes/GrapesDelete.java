package com.xworkz.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);
		
		
		String delete = "delete from grapesinfo where  id=1;";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(delete);
		System.out.println("affected" + affected);
	}

}
