package com.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg3 {
 public static void main(String[] args) throws SQLException {
	
	 Connection con=null;
	 Statement st=null;
	 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","Greenfr0g@");
		
		String insert="INSERT INTO emp(e_id,e_name,e_add,e_salary)values(1,'Sai','Hyd',50100.00)";
		
		st=con.createStatement();
		
		st.execute(insert);
		
		System.out.println("Record inserted");
	} catch (ClassNotFoundException e) {
		 
		e.printStackTrace();
	}finally {
		st.close();
		con.close();
		System.out.println("Connections closed");
	}
	 
}
}
