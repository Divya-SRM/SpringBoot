package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Order;

public interface OrderRepo extends JpaRepository<Order,Integer>{

}
