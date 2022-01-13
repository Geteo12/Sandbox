package com.gto.sandbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gto.sandbox.beans.User;
import com.gto.sandbox.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping ("/users")
	public Iterable<User> getUsers (){
		return userService.getUsers();
	}
}
