package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.service.ShapeService;

public class AopMain {
	public static void  main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = (ShapeService)context.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
