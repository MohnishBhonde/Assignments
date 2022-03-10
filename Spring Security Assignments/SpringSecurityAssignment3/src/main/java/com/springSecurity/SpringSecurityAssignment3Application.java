package com.springSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityAssignment3Application implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
	user User=new user(null, null, null);
	User.setEmail("abc@gmail");
	User.setUsername("abc");
	User.setPassword(this.bCryptPasswordEncoder.encode("abc"));
	this.userRepo.save(User);	
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignment3Application.class, args);
	}

}
