package br.com.cs.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getPortugueseGreeting() {
		return "Bom dia primario";
	}

	@Override
	public String getGermanGreeting() {

		return "Primärer Grußdienst";

	}

}
