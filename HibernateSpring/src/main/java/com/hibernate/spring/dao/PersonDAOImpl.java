package com.hibernate.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hibernate.spring.model.Person;

public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;
	
	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template){
		this.template = template;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Person p) {
		/*Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();*/
		
		template.save(p);
	}

	@SuppressWarnings("unchecked")
	public List<Person> list() {
		/*Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();*/
		
		List<Person> personList = new ArrayList<Person>();
		personList = template.loadAll(Person.class);
		return personList;
	}

}