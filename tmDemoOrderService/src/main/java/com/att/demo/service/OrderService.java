package com.att.demo.service;

import java.util.List;

import com.att.demo.model.Order;



public interface OrderService {

public List<Order> getOrders();

	
	public boolean isOrderExist(Order order);

	
	public void saveOrder(Order order);

	
	public Order getOrder(long id);
	
	
	public void deleteOrder(long id);
}
