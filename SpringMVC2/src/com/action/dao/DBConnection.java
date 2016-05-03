package com.action.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {

	
	public ArrayList getLocation(){
		ArrayList al = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/account","root","raghu");
			//System.out.println("Connected to database");
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select * from login_details;");
			while(result.next()){
//				System.out.printf("%-10s%-10s",result.getString(1),result.getString(2));
				System.out.println();
				al.add(result.getString(2));
			}
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return al;
	}
}
