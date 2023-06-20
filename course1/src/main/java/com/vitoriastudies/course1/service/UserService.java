package com.vitoriastudies.course1.service;


import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vitoriastudies.course1.entities.Product;
import com.vitoriastudies.course1.entities.User;
import com.vitoriastudies.course1.repositories.UserRepository;
import com.vitoriastudies.course1.service.exceptions.DatabaseException;
import com.vitoriastudies.course1.service.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		Sort sort = Sort.by("id").ascending();
		return  userRepository.findAll(sort);
	}
	
	public User findById(Long id){
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
		
	}
	
	public void delete(Long id) {
		try { 
			userRepository.deleteById(id);
		}catch(DataIntegrityViolationException e){
			throw new DatabaseException(e.getMessage());
			
		}catch(EmptyResultDataAccessException e){
			throw new ResourceNotFoundException(id);
		}
		
	}
	

	public User update(Long id,User user) {
		try {
		User entity = userRepository.getReferenceById(id);
		uopdateData(entity,user);
		return userRepository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	
		
	}

	private void uopdateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	
	}
}
