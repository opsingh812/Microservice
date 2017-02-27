package com.att.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.att.demo.model.Order;

import com.att.demo.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	
	@RequestMapping(value="/order/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Order getOrder(@PathVariable long id)
	{
		return orderService.getOrder(id);
	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Order>> getOrders() {
		/*List<Order> orders = orderService.getOrders();*/
		
		
		List<Order> orders=new ArrayList<Order>();
		
		ArrayList<String> notification1 = new ArrayList<String>();
		notification1.add("Order is confirmed");
		notification1.add("Thankyou! vendor has confirmed your order");
		orders.add(new Order("TV", "LED", "COMFIRMED", notification1, 111));
	

		ArrayList<String> notification2 = new ArrayList<String>();
		notification2.add("Order has been placed");
		notification2.add("Thankyou! for placing the order");
		orders.add(new Order("Phone", "iphone7", "PLACED", notification2, 222));

		ArrayList<String> notification3 = new ArrayList<String>();
		notification3.add("Your order is under processing");
		notification3.add("Once process is complete,we will notify via email");
		orders.add(new Order("Men", "Levis", "PROCESSING", notification3, 333));

		ArrayList<String> notification4 = new ArrayList<String>();
		notification4.add("Order Completed");
		notification4.add("Thankyou for ordering with us");
		orders.add(new Order("Household", "Cooker", "COMPLETED", notification4, 444));
		
		
		//RestTemplate rs=new RestTemplate();
		//Order order=rs.getForObject("http://localhost:8091/users",);
		
		
		if (orders.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		orderService.deleteOrder(id);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
