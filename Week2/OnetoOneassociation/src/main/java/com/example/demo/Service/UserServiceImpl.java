package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.User;
import com.example.demo.Entity.UserType;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Repository.UserTypeRepo;



@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private UserTypeRepo trepo;
	
	

	 public List<User> getUser() {
	        return repo.findAll();
	    }

    public void saveUser(User user) {
         repo.save(user);
    	}
    
    public void deleteUser(int id) {
        repo.deleteById(id);
        
    }
    public void saveUserType(UserType uType) {
        trepo.save(uType);
   	}

	public List<UserType> getUserType() {
		return trepo.findAll();
	}
	
	
	
}
