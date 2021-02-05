package com.LoginValidation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Validation {
	
	
	public boolean Data (String username, String userpass) throws SQLException, Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = System.getProperty("databaseurl"); //Url to the database stored as environment variable (VM argument)
		String user = System.getProperty("databaseusername"); // Database/connection username stored as environment variable (VM argument)
		String password = System.getProperty("databasepassword"); // Database/connection password stored as environment variable (VM argument)
		Connection ourcon = DriverManager.getConnection(url, user, password);
		Statement ourstat = ourcon.createStatement();
		String DBQuery = "SELECT * FROM randomlogins WHERE name='"+username+"' AND pass='"+userpass+"'";
		ResultSet ourtableresult = ourstat.executeQuery(DBQuery);
		if(ourtableresult.next()) {
			String selectedrow = ourtableresult.getString(1) + "|" + ourtableresult.getString(2) + "|" + ourtableresult.getInt(3);
			System.out.println(selectedrow);
			return true;
		} else {
			System.out.println("Data does not exist!");
			return false;
		}

		
	}
	
	public void DataStorage (String regname, String regsurname, int regage, String regemail, String regpassword) throws SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = System.getProperty("databaseurl"); //Url to the database stored as environment variable (VM argument)
		String user = System.getProperty("databaseusername"); // Database/connection username stored as environment variable (VM argument)
		String password = System.getProperty("databasepassword"); // Database/connection password stored as environment variable (VM argument)
		Connection connec = DriverManager.getConnection(url, user, password);
		Statement stat = connec.createStatement();
		String storingQuery = "INSERT INTO randomlogins VALUES('"+regname+"','"+regsurname+"',"+regage+",'"+regemail+"','"+regpassword+"')";
		int row = stat.executeUpdate(storingQuery);
		System.out.println(row + " data row added to database table.");
	}
}
