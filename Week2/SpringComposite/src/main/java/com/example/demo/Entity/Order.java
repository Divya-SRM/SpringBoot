package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="productid")
public class Order extends Product {

	public Order(int productid, String productname, String productdesc, int orderid, int orderamout) {
		super(productid, productname, productdesc);
		this.orderid = orderid;
		this.orderamout = orderamout;
	}



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
