package com.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Eg2 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		Statement st = null;
		
		try {
			//1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "Greenfr0g@");
			
			String create = "create table emp(e_id int, e_name varchar(45), e_address varchar(255), e_salary double)";
			
			//3
			st = con.createStatement();
			
			//4
			st.execute(create);
			
			System.out.println("Table Created");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} finally {
			
			//5
			st.close();
			con.close();
			System.out.println("Connections Closed");
			
			
		}
	}
}