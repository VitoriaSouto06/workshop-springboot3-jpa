package com.vitoriastudies.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriastudies.course1.entities.Product;



public interface ProductRepository extends JpaRepository<Product,Long>{

}
