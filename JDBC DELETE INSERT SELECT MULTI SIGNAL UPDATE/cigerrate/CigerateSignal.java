package com.xworkz.cigerrate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cigerate.constructor.Dbproperty;

public class CigerateSignal {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(), Dbproperty.USERNAME.getValue(),
				Dbproperty.PASSWORLD.getValue());

		System.out.println(connection);

		String select = "SELECT * FROM lipstick.perfumeinfo";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println(resultset);
		Boolean rowExist = resultset.next();
		System.out.println(rowExist);

		if (rowExist == true) {

			int id = resultset.getInt(1);
			System.out.println(id);
			
			int price=resultset.getInt(2);
			System.out.println(price);
			
			String brand =resultset.getString(3);
			System.out.println(brand);
			
			String Fragrance=resultset.getString(4);
			System.out.println(Fragrance);
			
			String Quality =resultset.getString(5);
			System.out.println(Quality);
			
		}
		else {
			System.out.println();
		}

	}
}
