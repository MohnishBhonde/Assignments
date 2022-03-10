package com.springBootAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldAssignment1SpringRest {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String helloWorldController() {
		return "Hello World";
	}

}
