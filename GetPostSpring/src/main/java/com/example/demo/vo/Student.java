package com.example.demo.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {
	private int studentId;
	private String studentName;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + "]";
	}

}
