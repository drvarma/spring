package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.DAO.TriangleDAOImpl;

public class TrinagleMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		TriangleDAOImpl triangleDAOImpl = context.getBean("triangleDAOImpl", TriangleDAOImpl.class);
		
		//triangleDAOImpl.createTriangle(1, "Equilateral");
		System.out.println(triangleDAOImpl.triangleCount());
		
	}

}
