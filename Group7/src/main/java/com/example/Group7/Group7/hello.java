package com.example.Group7.Group7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@RequestMapping("/hello")
	public String Hello() {
		return "Hello World";
	}
}
