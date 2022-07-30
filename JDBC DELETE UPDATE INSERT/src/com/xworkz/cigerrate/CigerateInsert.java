package com.xworkz.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CigerateInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);
		
		//String insert = "insert into perfumeinfo values(2,350,'ks','good','good');";
		//String insert = "insert into perfumeinfo values(3,450,'biuebeary','good','good');";
		//String insert = "insert into perfumeinfo values(4,250,'fog','good','good');";
		//String insert = "insert into perfumeinfo values(5,150,'touch','good','good');";
		//String insert = "insert into perfumeinfo values(6,650,'Hugo','good','good');";
		//String insert = "insert into perfumeinfo values(7,950,'Guess','good','good');";
		//String insert = "insert into perfumeinfo values(8,550,'power','good','good');";
		//String insert = "insert into perfumeinfo values(2,3950,'Giorgue','good','good');";
		String insert = "insert into perfumeinfo values(10,450,'vere','good','good');";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insert);
		System.out.println("affected" + affected);
	}

}
