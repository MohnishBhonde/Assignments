package com.springSecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurity.models.User;
import com.springSecurity.services.UserServices;

@RestController
@RequestMapping("/models")
public class Controller {
    
	@Autowired
	public UserServices userservice;
	
	@GetMapping("/")
	public List<User> getAllmodels(){
		return this.userservice.getAllUser();
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userservice.getUser(username);
	}
	
	
	@PostMapping("/")
	public User add(@RequestBody  User user) {
		return this.userservice.addUser(user);
	}
}
