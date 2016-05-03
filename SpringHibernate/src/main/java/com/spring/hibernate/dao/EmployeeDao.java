package com.spring.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.spring.hibernate.model.Employee;

public class EmployeeDao {
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public void saveEmployee(Employee emp){
		template.save(emp);
	}
	
	public void updateEmployee(Employee emp){
		template.update(emp);
	}
	
	public void deleteEmployee(Employee emp){
		template.delete(emp);
	}
	
	public Employee getEmployee(int id){
		return template.get(Employee.class, id);
	}
	
	public List<Employee> getEmployees(){
		List<Employee> emps = new ArrayList<Employee>();
		emps = template.loadAll(Employee.class);
		return emps;
	}

}
