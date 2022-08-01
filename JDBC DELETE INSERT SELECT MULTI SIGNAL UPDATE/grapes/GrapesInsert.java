package com.xworkz.grapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrapesInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);
		
		//String insert = "insert into grapesinfo values(2,40,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(3,30,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(4,50,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(5,40,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(6,60,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(7,70,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(8,80,'Fascinating ','black','good');";
		//String insert = "insert into grapesinfo values(9,90,'Fascinating ','black','good');";
		String insert = "insert into grapesinfo values(10,140,'Fascinating ','black','good');";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insert);
		System.out.println("affected" + affected);
	}

}
