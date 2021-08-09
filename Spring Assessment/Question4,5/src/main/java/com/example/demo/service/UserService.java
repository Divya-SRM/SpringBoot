package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;



@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public List<User> getUser()
    {
    	return repo.findAll();
    }

	
	 public List<User> findUser() {
	        return repo.findAll();
	    }
	
    public void saveUser(User user) {
         repo.save(user);
    	}
}
