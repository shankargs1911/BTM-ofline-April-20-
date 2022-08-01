package com.xworkz.Perfume;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.cigerate.constructor.Dbproperty;

public class PerfumeSignal {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(), Dbproperty.USERNAME.getValue(),
				Dbproperty.PASSWORLD.getValue());

		System.out.println(connection);

		String select = "SELECT * FROM lipstick.cigerrate";

		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(select);
		System.out.println(resultset);
		Boolean rowExist = resultset.next();
		System.out.println(rowExist);

		if (rowExist == true) {

			int id = resultset.getInt(1);
			System.out.println(id);

			String brand =resultset.getString(2);
			System.out.println(brand);
			
			int price=resultset.getInt(3);
			System.out.println(price);
			
			int tobaco =resultset.getInt(4);
			System.out.println(tobaco);
			
			String fleaver=resultset.getString(5);
			System.out.println(fleaver);
		}
		else {
			System.out.println();
		}

	}
}
