package br.com.cs.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary // Makes this implementation the default one
@Profile({ "en", "default" }) // when we don't have any profile defined in the properties file Spring does'nt
								// know how to pick one so we can define a default one
public class PrimaryGeetringService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello - Primary Greeting Service";
	}

}
