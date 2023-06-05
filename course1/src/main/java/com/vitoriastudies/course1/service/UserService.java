package com.vitoriastudies.course1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vitoriastudies.course1.entities.Product;
import com.vitoriastudies.course1.entities.User;
import com.vitoriastudies.course1.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return  userRepository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
	public User insert(User user) {
		return userRepository.save(user);
		
	}
	
	public void delete(Long id) {
		 userRepository.deleteById(id);
	}
}
