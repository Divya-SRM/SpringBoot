package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserType;

@Repository
public interface UserTypeRepo extends JpaRepository<UserType,Integer> {

}
