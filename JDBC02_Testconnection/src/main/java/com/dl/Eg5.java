package com.dl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Eg5 {
	public static void main(String[] args) throws SQLException {
		
		 Connection con=null;
		 Statement st=null;
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","Greenfr0g@");
			
			String update="update emp set e_name='Sais',e_add='Ghat',e_salary=50000.00 where e_id=2";
			
			st=con.createStatement();
			
			st.execute(update);
			
			System.out.println("Record updated");
		} catch (ClassNotFoundException e) {
			 
			e.printStackTrace();
		}finally {
			st.close();
			con.close();
			System.out.println("Connections closed");
		}
		 
	}
}
