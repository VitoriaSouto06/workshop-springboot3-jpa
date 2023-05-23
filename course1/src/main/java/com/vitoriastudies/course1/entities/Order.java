package com.vitoriastudies.course1.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vitoriastudies.course1.enums.OrderStatus;



public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Instant moment;
	
	private Integer orderStatus;
	

	private User client;
	

	public Order() {
		super();
	}
	public Order(Instant moment, OrderStatus orderStatus, User client) {
		super();
		
		this.moment = moment;
		setOrderStatus(orderStatus);
		this.client = client;
	}
	public OrderStatus getOrderStatus() {
		return OrderStatus.valureOf(orderStatus);
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatus != null) {
		this.orderStatus = orderStatus.getCode();
	}}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getMoment() {
		return moment;
	}
	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	


	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	
}