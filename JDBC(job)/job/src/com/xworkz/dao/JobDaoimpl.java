package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicInteger;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.constant.Dbproperty;
import com.xworkz.constant.Designation;
import com.xworkz.constant.Qualification;
import com.xworkz.dto.JobDto;

public class JobDaoimpl implements JobDao {

	@Override
	public boolean save(JobDto jobDTO) {
		try {
			Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(),
					Dbproperty.USERNAME.getValue(), Dbproperty.SECRET.getValue());
			String insert = "insert into jobdetails values(?,?,?,?,?,?); ";

			PreparedStatement preparedStatement = connection.prepareStatement(insert);

			System.out.println("insert query" + insert);

			preparedStatement.setInt(1, jobDTO.getJid());
			preparedStatement.setString(2, jobDTO.getDesignation().getDesignation());
			preparedStatement.setDouble(3, jobDTO.getPackagee());
			preparedStatement.setString(4, jobDTO.getQualification().getQualification());
			preparedStatement.setDouble(5, jobDTO.getPercentage());
			preparedStatement.setString(6, jobDTO.isFresher());
			System.out.println("statement" + preparedStatement);

			int rowAffected = preparedStatement.executeUpdate();

			return rowAffected > 1 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public JobDto findByID(int id) {
		try {
			Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(),
					Dbproperty.USERNAME.getValue(), Dbproperty.SECRET.getValue());

			String select = "SELECT * FROM job.jobdetails id=?";
			PreparedStatement statement = connection.prepareStatement(select);
			statement.setInt(1, id);

			ResultSet resultset = statement.executeQuery();
			AtomicInteger atomicInteger = new AtomicInteger();
			while (resultset.next()) {
				int pk = resultset.getInt(1);
				String designation = resultset.getString(2);
				Double salaryPackage = resultset.getDouble(3);
				String qualifaction = resultset.getString(4);
				Double percenatge = resultset.getDouble(5);
				String fresher = resultset.getString(5);

				JobDto jobDTO = new JobDto();
				jobDTO.setJid(pk);
				jobDTO.setDesignation(Designation.valueOf(designation));
				jobDTO.setPackagee(salaryPackage);
				jobDTO.setQualification(Qualification.valueOf(qualifaction));
				jobDTO.setPercentage(percenatge);
				jobDTO.setFresher(fresher);
				return jobDTO;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean isFresherByid(int id) {
		try {
			Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(),
					Dbproperty.USERNAME.getValue(), Dbproperty.SECRET.getValue());

			String select = "SELECT * FROM job.jobdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(select, id);
			preparedStatement.execute();
		} catch (SQLException e) {
			System.out.println("no data found");
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public double getmaxPercentage() {
		try {
			Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(),
					Dbproperty.USERNAME.getValue(), Dbproperty.SECRET.getValue());

			String select = "SELECT * FROM job.jobdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setDouble(getTotal(), getmaxPercentage());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int getTotal() {
		try {
			Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(),
					Dbproperty.USERNAME.getValue(), Dbproperty.SECRET.getValue());

			String select = "SELECT * FROM job.jobdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public JobDto findbyidandDesignation(int id, String Designation) {
		try {
			Connection connection = DriverManager.getConnection(Dbproperty.URL.getValue(),
					Dbproperty.USERNAME.getValue(), Dbproperty.SECRET.getValue());

			String select = "SELECT * FROM job.jobdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(Designation, id);
			preparedStatement.execute(Designation, getTotal());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
