package com.spring.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hibernate.dao.EmployeeDao;
import com.spring.hibernate.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
		
//		List<Employee> empList = employeeDao.getEmployees();
//		for(Employee emp:empList){
//			System.out.println(emp.getName()+" "+emp.getSalary());
//		}
		
		Employee emp = new Employee();
		emp.setName("chintu");
		emp.setSalary(70000);
		
		employeeDao.saveEmployee(emp);
//		empList = employeeDao.getEmployees();
//		for(Employee e:empList){
//			System.out.println(e.getName()+" "+e.getSalary());
//		}
		

	}

}
