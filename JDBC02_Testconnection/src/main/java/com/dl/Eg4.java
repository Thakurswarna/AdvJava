package com.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg4 {
 public static void main(String[] args) throws SQLException {
	
	 Connection con=null;
	 Statement st=null;
	 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","Greenfr0g@");
		
		String s1="INSERT INTO emp(e_id,e_name,e_add,e_salary)values(1,'Sai k','Hyd',50100.00)";
		String s2="INSERT INTO emp(e_id,e_name,e_add,e_salary)values(2,'Sai Kris','Hyd',50100.00)";
		String s3="INSERT INTO emp(e_id,e_name,e_add,e_salary)values(3,'Sai V','Hyd',50100.00)";
		
		st=con.createStatement();
		
		st.addBatch(s1);
		st.addBatch(s2);
		st.addBatch(s3);
		
		int[] executeBatch=st.executeBatch();
		for (int i :executeBatch) {
			System.out.println(i);
		}
		 
		
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
