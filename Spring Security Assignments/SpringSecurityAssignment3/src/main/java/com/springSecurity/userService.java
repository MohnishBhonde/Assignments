package com.springSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class userService {

	List<user> list = new ArrayList<user>();

	public userService() {
		
		list.add(new user("abc", "abc", "abc@gmail.com"));

	}

	
	public List<user> getAllUsers(){
		return this.list;
	}
	
	public user getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}

	public user addUser(user User) {
		this.list.add(User);
		return User;
	}
}
