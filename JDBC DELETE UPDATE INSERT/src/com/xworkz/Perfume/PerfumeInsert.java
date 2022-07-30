package com.xworkz.Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PerfumeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);
		
		//String insert = "insert into cigerrate values(2,'indement',10,'4','bad');";
		//String insert = "insert into cigerrate values(4,'lights',18,'4','bad');";
		//String insert = "insert into cigerrate values(3,'king',15,'4','bad');";
		//String insert = "insert into cigerrate values(5,'black',15,'4','bad');";
		//String insert = "insert into cigerrate values(6,'wilights',10,'4','bad');";
		//String insert = "insert into cigerrate values(7,'mond',20,'4','bad');";
		//String insert = "insert into cigerrate values(8,'doublebast',10,'4','bad');";
		//String insert = "insert into cigerrate values(9,'bristal',10,'4','bad');";
		String insert = "insert into cigerrate values(10,'davideaff',10,'4','bad');";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insert);
		System.out.println("affected" + affected);

	}

}
