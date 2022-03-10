package com.springSecurity.models;

public class User {
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	String email;
	String Password;
	String username;
	public User(String email, String password, String username) {
		super();
		this.username = username;
		this.email = email;
		Password = password;
	}
	
}
