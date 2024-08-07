package com.dl;

import java.sql.SQLException;

public class Eg1 {
public static void main(String[] args) throws SQLException{
	try {
		//load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("JDBC driver loaded successfully");
	}catch(ClassNotFoundException e) {
		System.out.println("JDBC Driver not found");
		 
	}
}
}
