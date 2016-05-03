package com.action.Spring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Student {
	@Size(min=2, max=15)
	private String studentName;
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	private int studentNumber;
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	private int studentMarks;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	public String toString(){
		return "Student Name: "+studentName+", Number: "+studentNumber+", Marks: "+studentMarks;
	}

}
