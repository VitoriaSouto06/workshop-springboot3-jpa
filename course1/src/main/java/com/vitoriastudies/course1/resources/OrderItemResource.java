package com.vitoriastudies.course1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitoriastudies.course1.entities.OrderItem;
import com.vitoriastudies.course1.service.OrderItemService;

@RestController
@RequestMapping("/orderitems")
public class OrderItemResource {

	@Autowired
	private OrderItemService orderItemService;
	
	
	@GetMapping
	public ResponseEntity<List<OrderItem>> findAll(){
		List<OrderItem> list = orderItemService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable Integer id) {
		OrderItem obj = orderItemService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
