package br.com.cs.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {

	public static final String HELLO_MSG = "HELLO GUYS - Original";

	@Override
	public String sayGreeting() {
		return HELLO_MSG;
	}

}
