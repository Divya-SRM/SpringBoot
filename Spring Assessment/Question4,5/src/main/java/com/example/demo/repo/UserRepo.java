package com.example.demo.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User,Integer>  {
	
	@Query("SELECT u FROM User u WHERE u.userid= 1")
	List<User> findAll();

}
