package com.tutorialpoint.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.tutorialpoint.model.Student;

@Component
public class StudentJdbcTemplate implements StudentDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age) {
		String sql = "insert into student(name, age) values(?,?)";
		jdbcTemplate.update(sql, name, age);
		System.out.println("Created record Name="+name+" Age="+age);
	}

	@Override
	public Student getStudent(Integer id) {
		String sql = "Select * from student where id=?";
		Student student = jdbcTemplate.queryForObject(sql, new Object[] {id}, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from student";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper()); 
		return  students;
	}

	@Override
	public void delete(Integer id) {
		String sql = "delete from student where id=?";
		jdbcTemplate.update(sql, id);
		System.out.println("Delete Student record with ID="+id);
	}

	@Override
	public void update(Integer id, Integer age) {
		String sql = "update student set age=? where id=?";
		jdbcTemplate.update(sql, age, id);
		System.out.println("Updated the Student recoed with ID="+id);
	}
	
	class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student stu = new Student();
			stu.setAge(rs.getInt("age"));
			stu.setName(rs.getString("name"));
			stu.setId(rs.getInt("id"));
			return stu;
		}
		
	}

}
