package com.action.model;

public class Student {
	private String studentName;
	private int studentAge;
	private int studentId;
	
	public Student(){}
	
	public Student(String studentName, int studentAge, int studentId) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
}
