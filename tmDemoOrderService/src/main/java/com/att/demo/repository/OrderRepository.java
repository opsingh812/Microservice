package com.att.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.att.demo.model.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	public Order findByoName(String oName);
	
}
