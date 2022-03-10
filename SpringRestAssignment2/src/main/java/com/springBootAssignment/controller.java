package com.springBootAssignment;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@RequestMapping("/auth.html")
	public String controller(@ModelAttribute("User") User User) {
		boolean isValid=check(User.getUsername(),User.getPassword());
		if (isValid) {
			return "Valid User";
		}
		else {
			return"Invalid User";
		}

	}
	private boolean check(String username, String password) {
		if (username.contentEquals("Mohnish") && password.contentEquals("Password")) {
			return true;
		}
		else {
			return false;
		}
	}

}
	