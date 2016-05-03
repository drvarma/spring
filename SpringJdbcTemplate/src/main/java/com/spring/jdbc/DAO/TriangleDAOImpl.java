package com.spring.jdbc.DAO;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class TriangleDAOImpl {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void createTriangle(int id, String name){
		String sql = "insert into triangle values(?,?)";
		jdbcTemplate.update(sql, id, name);
		System.out.println("New "+ name+" triangle created");
	}
	
	public Integer triangleCount(){
		return jdbcTemplate.queryForObject("select count(*) from triangle", Integer.class); 
	}
	
	
	
	
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
