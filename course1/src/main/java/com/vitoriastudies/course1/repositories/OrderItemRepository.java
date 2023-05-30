package com.vitoriastudies.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriastudies.course1.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

}
