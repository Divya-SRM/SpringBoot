package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;



public class Company implements Serializable {
	
	
	private int id;
	
	private int compid;

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
