package com.example.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class ServiceARestController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world from Service A!";
	}

}
