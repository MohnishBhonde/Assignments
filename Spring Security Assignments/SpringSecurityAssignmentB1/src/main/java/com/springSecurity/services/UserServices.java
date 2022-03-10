package com.springSecurity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springSecurity.models.User;

@Service
public class UserServices {
	
List<User> list= new ArrayList<>();


public UserServices() {
	list.add(new User("abc@gmail.com","abc","abc"));
	list.add(new User("xyz@gmail.com","xyz","xyz"));
	
}
public List<User> getAllUser(){
	return this.list;
	
}

public User getUser(String username) {
	return this.list.stream().filter((User) -> User.getUsername().equals(username)).findAny().get();
	
}

public User addUser(User user) {
	this.list.add(user);
	return user;
}

}




