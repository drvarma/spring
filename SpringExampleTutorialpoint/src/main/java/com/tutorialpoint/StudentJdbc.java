package com.tutorialpoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialpoint.DAO.StudentJdbcTemplate;
import com.tutorialpoint.model.Student;

public class StudentJdbc {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentJdbcTemplate studentJdbcTemplate = (StudentJdbcTemplate)context.getBean("studentJdbcTemplate");
		
		studentJdbcTemplate.create("raghu", 25);
		studentJdbcTemplate.create("meena", 24);
		studentJdbcTemplate.create("chintu", 22);
		
		List<Student> students = studentJdbcTemplate.listStudents();
		for(Student student: students){
			System.out.println("Name="+student.getName()+" Age="+student.getAge()+" Id="+student.getId());
		}
		
		studentJdbcTemplate.getStudent(2);
		studentJdbcTemplate.update(1, 26);
	}

}
