package com.xworkz.bottle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LipstickInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lipstick", "root",
				"Sh@9740739746");

		System.out.println(connection);

		//String insert = "insert into lipstickinfo values(6,'mac',300.0,'bullet','small');";
		//String insert = "insert into lipstickinfo values(7,'hudabeauty',300.0,'bullet','small');";
		//String insert = "insert into lipstickinfo values(8,'miglamn',300.0,'bullet','small');";
		//String insert = "insert into lipstickinfo values(9,'lorial',300.0,'bullet','small');";
		String insert = "insert into lipstickinfo values(10,'weetwild',300.0,'bullet','small');";

		Statement statement = connection.createStatement();

		int affected = statement.executeUpdate(insert);
		System.out.println("affected" + affected);
	}

}
