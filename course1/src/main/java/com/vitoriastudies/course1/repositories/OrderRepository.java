package com.vitoriastudies.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriastudies.course1.entities.Order;



public interface OrderRepository extends JpaRepository<Order,Long>{

}
