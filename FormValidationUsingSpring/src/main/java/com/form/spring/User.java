package com.form.spring;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	
	@Size(min=2, max=20)
	private String name;
	
	@NotNull
	@Min(18)
	private int age;
	
	@NotEmpty
	@Email
	private String email;
	
	@Size(min=10)
	private int phone;
	
	@NotNull
	private int gender;
	
	@NotNull @Past
	@DateTimeFormat(pattern="MM/DD/YYYY")
	private Date dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + ", gender=" + gender + ", dob=" + dob
				+ "]";
	}
	
	

}
