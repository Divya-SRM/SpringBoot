package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Order;
import com.example.demo.Entity.Product;
import com.example.demo.Service.OrderService;
import com.example.demo.Service.ProductService;

@RestController
public class MyController {
	@Autowired
	private ProductService pservice;
	
	@Autowired
	private OrderService oservice;
	
	
	
	@GetMapping(value="/product")
	public ResponseEntity<List<Product>> findAllUser() {
	return new ResponseEntity<List<Product>>(pservice.getProduct(), HttpStatus.OK);
		
	}
		
	@PostMapping(value="/product")
	public ResponseEntity<String> addProdct(@RequestBody Product product) {
	pservice.saveProduct(product);
	return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
	}
	@GetMapping(value="/order")
	public ResponseEntity<List<Order>> findAllOrder() {
	return new ResponseEntity<List<Order>>(oservice.getOrder(), HttpStatus.OK);
		
	}
		
	@PostMapping(value="/order")
	public ResponseEntity<String> addProdct(@RequestBody Order order) {
	oservice.saveProduct(order);
	return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
	}
	
	

}
