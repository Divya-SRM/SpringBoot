package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Order;
import com.example.demo.Entity.Product;
import com.example.demo.Repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productrepo;

	public List<Product> getProduct() {
		return productrepo.findAll();
	}

	public void saveProduct(Product product) {
		productrepo.save(product);
		
	}


}
