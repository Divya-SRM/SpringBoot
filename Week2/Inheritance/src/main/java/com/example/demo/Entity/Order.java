package com.example.demo.Entity;

import javax.persistence.Entity;

@Entity
public class Order extends Product {

	private int orderid;
	
	private int orderamout;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getOrderamout() {
		return orderamout;
	}

	public void setOrderamout(int orderamout) {
		this.orderamout = orderamout;
	}
	
}
