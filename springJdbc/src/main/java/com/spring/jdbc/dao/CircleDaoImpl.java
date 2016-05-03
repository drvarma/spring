package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.model.Circle;

@Component
public class CircleDaoImpl {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void addCircle(){
		jdbcTemplate.update("insert into circle values(4,'newCirlce')");
		System.out.println("circle created");
	}
	
	public void printCircles(){
		String sql = "select * from cirlce";
		List<Circle> circles =jdbcTemplate.query(sql, new CircleMapper());
		for(Circle circle:circles){
			System.out.println(" Circle ID="+circle.getId()+" Name="+circle.getName());
		}
	}

	public Integer getCircleCount() {
		return jdbcTemplate.queryForObject("select count(*) from circle", Integer.class);
	}
	
	class CircleMapper implements RowMapper<Circle>{

		@Override
		public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(rs.getInt("id"));
			circle.setName(rs.getString("name"));
			return circle;
		}
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
