package com.att.demo.service;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.att.demo.model.Order;
import com.att.demo.repository.OrderRepository;

@Transactional
@Service
public class InitDBService {

	@Autowired
	private OrderRepository orderRepository;
	
	/*@PostConstruct
	public void init() {
		if (orderRepository != null) {

			
			ArrayList<String> notification1 = new ArrayList<String>();
			notification1.add("Order is confirmed");
			notification1.add("Thankyou! vendor has confirmed your order");
			orderRepository.save(new Order("TV", "LED", "COMFIRMED", notification1, 111));
		

			ArrayList<String> notification2 = new ArrayList<String>();
			notification2.add("Order has been placed");
			notification2.add("Thankyou! for placing the order");
			orderRepository.save(new Order("Phone", "iphone7", "PLACED", notification2, 222));

			ArrayList<String> notification3 = new ArrayList<String>();
			notification3.add("Your order is under processing");
			notification3.add("Once process is complete,we will notify via email");
			orderRepository.save(new Order("Men", "Levis", "PROCESSING", notification3, 333));

			ArrayList<String> notification4 = new ArrayList<String>();
			notification4.add("Order Completed");
			notification4.add("Thankyou for ordering with us");
			orderRepository.save(new Order("Household", "Cooker", "COMPLETED", notification4, 444));

		}
	}
	*/
	
	
}
