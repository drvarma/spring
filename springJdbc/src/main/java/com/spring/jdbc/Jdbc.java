package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.CircleDaoImpl;

public class Jdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");   
		CircleDaoImpl dao = (CircleDaoImpl)context.getBean("circleDaoImpl");
		System.out.println(dao.getCircleCount());
		//dao.addCircle();
		//dao.printCircles();

	}

}
