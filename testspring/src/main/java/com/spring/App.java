package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person) context.getBean("person1");
		System.out.println(person.getId()+" "+person.getName());
		((ClassPathXmlApplicationContext)context).close();

	}

}
