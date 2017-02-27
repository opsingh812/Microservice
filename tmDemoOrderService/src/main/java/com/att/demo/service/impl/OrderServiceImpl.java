package com.att.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.att.demo.model.Order;
import com.att.demo.repository.OrderRepository;
import com.att.demo.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
	public List<Order> getOrders() {
	
		List<Order> orders=orderRepository.findAll();
		return orders;
	}

	@Override
	public boolean isOrderExist(Order order) {
		
		return orderRepository.findByoName(order.getoName()) !=null;
	}

	@Override
	public void saveOrder(Order order) {
		
		orderRepository.save(order);
	}

	@Override
	public Order getOrder(long id) {
		
		return orderRepository.findOne(id);
		
	}

	@Override
	public void deleteOrder(long id) {
		orderRepository.delete(id);

	}

}
