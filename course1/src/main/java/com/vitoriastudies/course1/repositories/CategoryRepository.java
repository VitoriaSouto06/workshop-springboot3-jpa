package com.vitoriastudies.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriastudies.course1.entities.Category;



public interface CategoryRepository extends JpaRepository<Category,Long> {

}
