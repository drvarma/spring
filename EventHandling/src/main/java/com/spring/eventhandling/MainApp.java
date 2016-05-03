package com.spring.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		
		HelloWorld helloworld = (HelloWorld)context.getBean("helloWorld");
		helloworld.getMessage();
		
		context.stop();
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
