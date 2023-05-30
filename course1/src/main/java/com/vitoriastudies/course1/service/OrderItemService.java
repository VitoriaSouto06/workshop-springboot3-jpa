package com.vitoriastudies.course1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitoriastudies.course1.entities.OrderItem;
import com.vitoriastudies.course1.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public List<OrderItem> findAll(){
		return orderItemRepository.findAll();
	}
	
	public OrderItem findById(Integer id) {
		Optional<OrderItem> obj = orderItemRepository.findById(id);
		return obj.get();
	}
}
