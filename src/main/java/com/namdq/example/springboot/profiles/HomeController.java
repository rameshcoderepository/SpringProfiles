package com.namdq.example.springboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private Environment environment;

	@GetMapping("/")
	public String home() {
		System.out
				.println("Application is starting with port: {}" + " " + environment.getProperty("local.server.port"));
		return "Application is starting with port: " + environment.getProperty("local.server.port");
	}
}
