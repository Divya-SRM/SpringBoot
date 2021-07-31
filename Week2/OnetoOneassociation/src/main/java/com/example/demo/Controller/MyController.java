package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserType;
import com.example.demo.Service.UserServiceImpl;

@RestController
public class MyController {

	@Autowired
	private UserServiceImpl service;

	@GetMapping(value = "/usertype")
	public ResponseEntity<List<UserType>> findAllUser() {
		return new ResponseEntity<List<UserType>>(service.getUserType(), HttpStatus.OK);

	}

	@PostMapping(value = "/user")
	public ResponseEntity<String> addUser(@Valid @RequestBody UserType usertype) {
		service.saveUserType(usertype);
		return new ResponseEntity<String>("record saved successfully", HttpStatus.OK);
	}

}
