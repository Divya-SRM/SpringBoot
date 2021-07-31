package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Bank;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserServiceImpl;

@RestController
public class MyController extends BaseController {
	
	@Autowired
	private UserServiceImpl service;
  
	 @GetMapping(value="/user")
		public ResponseEntity<List<User>> findAllUser() {
		return new ResponseEntity<List<User>>(service.getUser(), HttpStatus.OK);
			
		}
	@PostMapping(value="/user")
	public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
		service.saveUser(user);
		return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
		}
	
	@DeleteMapping(value="/user/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer id) 
	{
		service.deleteUser(id);
		return new ResponseEntity<String>("record deleted successfully", HttpStatus.OK);	
		}
	
	@PutMapping(value="/user")
	public ResponseEntity<String> updateUser(@Valid @RequestBody User user) {
		service.saveUser(user);
		return new ResponseEntity<String>("record updated successfully",HttpStatus.OK);
		}
	
//	@GetMapping(value="/usertype")
//	public ResponseEntity<List<UserType>> findAllUserType() {
//	return new ResponseEntity<List<UserType>>(service.getUserType(), HttpStatus.OK);
//		
//	}
//	
//	@PostMapping(value="/usertype")
//	public ResponseEntity<String> addUserType(@Valid @RequestBody UserType utype) {
//		service.saveUserType(utype);
//		return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
//		}
	
	@GetMapping(value="/bank")
	public ResponseEntity<List<Bank>> findAllBankUser() {
	return new ResponseEntity<List<Bank>>(service.getBankUser(), HttpStatus.OK);
		
	}
	
	@PostMapping(value="/bank")
	public ResponseEntity<String> addBankUser(@Valid @RequestBody Bank bank) {
		service.saveBankUser(bank);
		return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
		}
}
