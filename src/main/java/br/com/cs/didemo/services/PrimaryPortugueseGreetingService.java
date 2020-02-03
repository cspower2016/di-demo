package br.com.cs.didemo.services;

public class PrimaryPortugueseGreetingService implements GreetingService {

	GreetingRepository greetingRepository;

	public PrimaryPortugueseGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return this.greetingRepository.getPortugueseGreeting();
	}

}
