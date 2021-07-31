package com.example.demo.Entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
@IdClass(Company.class)
public class Employee  {
	
	@Id
	private int id;
	
	@Id
	private int compid;
	
	private String empname;
	


	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompid() {
		return compid;
	}

	public void setCompid(int compid) {
		this.compid = compid;
	}
	
	
	

}
