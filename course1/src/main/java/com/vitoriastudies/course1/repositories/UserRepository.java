package com.vitoriastudies.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitoriastudies.course1.entities.User;



public interface UserRepository extends JpaRepository<User,Long>{

}
