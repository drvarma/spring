package com.hibernate.spring.dao;

import java.util.List;

import com.hibernate.spring.model.Person;

public interface PersonDAO {
	public void save(Person p);
	
	public List<Person> list();
}
