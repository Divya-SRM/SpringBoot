package com.example.demo.Entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {
	@NotNull(message = "Id is mandatory") 
	private int Id;
	
	@Size(min=2,message="Name must have more than 2 letter")
	private String studentName;
	
	@NotNull(message="Date is mandatory")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id)throws Exception
	{
		Id = id;
	}

	public String getStudentName()throws Exception
	{
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
		return "Student [Id=" + Id + ", studentName=" + studentName + ", dob=" + dob + "]";
	}
	
}
