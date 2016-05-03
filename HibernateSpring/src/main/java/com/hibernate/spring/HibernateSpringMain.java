package com.hibernate.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.spring.dao.PersonDAO;
import com.hibernate.spring.model.Person;


public class HibernateSpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		
		Person person = new Person();
		person.setName("raghu");
		person.setCountry("india");

		personDAO.save(person);
		
		System.out.println("Person: "+person);
		
		List<Person> list = personDAO.list();
		for(Person p:list){
			System.out.println("Person: "+p);
		}
		
		//context.close();
	}

}
