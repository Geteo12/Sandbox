package com.gto.sandbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gto.sandbox.beans.User;
import com.gto.sandbox.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public Iterable<User> getUsers() {
		return userRepo.findAll();
	}
	
}
