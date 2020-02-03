package br.com.cs.didemo.services;

public class GreetingServiceFactory {

	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	public GreetingService createGreetingService(String lang) {

		switch (lang) {
		case "en":
			return new PrimaryGeetringService(greetingRepository);
		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);
		case "pt":
			return new PrimaryPortugueseGreetingService(greetingRepository);
		default:
			return new PrimaryGeetringService(greetingRepository);
		}
	}

}
