package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.EmployeeRepo;

@Service
public class EmployeeService
{
	@Autowired
	private EmployeeRepo repo;

	public List<Employee> getUser() {
		return repo.findAll();
	}

	public void saveUser(Employee user) {
		repo.save(user);
		
	}
	
	
	
}
