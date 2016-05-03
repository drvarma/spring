package com.action.spring;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test {
	
	@RequestMapping(value="/post", method=RequestMethod.GET)
	public void postMethod(@PathVariable("name") String name, @PathVariable("age") String age) throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "raghu");
		Statement st = con.createStatement();
		String query = "insert into person ('name','age') values('"+name+"','"+age+"')";
		st.executeQuery(query);
		System.out.println("Person added");
		
		
	}

}
