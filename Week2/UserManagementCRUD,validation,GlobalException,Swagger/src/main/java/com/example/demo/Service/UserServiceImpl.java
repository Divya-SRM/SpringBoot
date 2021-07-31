package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Bank;
import com.example.demo.Entity.User;
import com.example.demo.Repo.BankRepo;
import com.example.demo.Repo.UserRepo;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo repo;
	
//	@Autowired
//	private UserTypeRepo trepo;
	
	@Autowired
	private BankRepo bankrepo;

	 public List<User> getUser() {
	        return repo.findAll();
	    }

    public void saveUser(User user) {
         repo.save(user);
    	}
    
    public void deleteUser(int id) {
        repo.deleteById(id);
        
    }
//    public void saveUserType(UserType uType) {
//        trepo.save(uType);
//   	}
//
//	public List<UserType> getUserType() {
//		return trepo.findAll();
//	}
	
	 public void saveBankUser(Bank bank) {
	        bankrepo.save(bank);
	   	}

		public List<Bank> getBankUser() {
			return bankrepo.findAll();
		}

	
}
