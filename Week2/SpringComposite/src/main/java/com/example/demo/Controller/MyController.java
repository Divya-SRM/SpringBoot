package com.example.demo.Controller;

import java.util.List;



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
import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;


@RestController
public class MyController extends BaseController {
	
	@Autowired
	private EmployeeService service;
  
	 @GetMapping(value="/employee")
		public ResponseEntity<List<Employee>> findAllUser() {
		return new ResponseEntity<List<Employee>>(service.getUser(), HttpStatus.OK);
			
		}
	@PostMapping(value="/employee")
	public ResponseEntity<String> addUser(@RequestBody Employee user) {
		service.saveUser(user);
		return new ResponseEntity<String>("record saved successfully",HttpStatus.OK);
		}
	
	
}
