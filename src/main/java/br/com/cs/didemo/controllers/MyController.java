package br.com.cs.didemo.controllers;

import org.springframework.stereotype.Controller;

import br.com.cs.didemo.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayGreeting();
	}

}
