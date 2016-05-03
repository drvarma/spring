package com.tutorialpoint.DAO;

import java.util.List;
import javax.sql.DataSource;
import com.tutorialpoint.model.Student;

public interface StudentDAO {
	
	public void setDataSource(DataSource ds);
	
	public void create(String name, Integer age);
	
	public Student getStudent(Integer id);
	
	public List<Student> listStudents();
	
	public void delete(Integer id);
	
	public void update(Integer id, Integer age);
	
}
