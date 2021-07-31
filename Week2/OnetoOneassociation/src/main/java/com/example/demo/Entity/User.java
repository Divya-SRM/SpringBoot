package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class User {
	
	@Id
	@Column(name = "id")
	private int id;
	
	
	@Size(min=5,message="name atleast have 5 letters")
	@Column(name = "name")
	private String name;
	
	
	@Email(message="incorrect email format")
	@NotBlank(message="email mandatory")
	@Column(name = "email")
	private String email;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Please provide a date.")
	@Column(name = "dob")
	private Date dob;
    
    @Temporal(TemporalType.TIMESTAMP)
	private Date DateTime=new Date(System.currentTimeMillis());
    
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	

}
