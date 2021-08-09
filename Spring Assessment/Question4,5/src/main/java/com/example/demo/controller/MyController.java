package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService service;
	
	 @GetMapping(value="/user")
		public ResponseEntity<List<User>> findAllUser() {
		return new ResponseEntity<List<User>>(service.getUser(), HttpStatus.CREATED);	
		}
	 
	 
	 
	 
	@PostMapping(value="/user")
	public ResponseEntity<String> addUser( @RequestBody User user) {
		service.saveUser(user);
		return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
		}
	
	
	
	

}
