package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.Order;
import com.example.demo.Entity.Product;
import com.example.demo.Repo.OrderRepo;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orepo;

	public void saveProduct(Order order) {
		orepo.save(order);
	}

	public List<Order> getOrder() {
		
		return orepo.findAll();
	}

}
