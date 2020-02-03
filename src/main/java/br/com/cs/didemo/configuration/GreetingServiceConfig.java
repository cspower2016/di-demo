package br.com.cs.didemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import br.com.cs.didemo.services.GreetingRepository;
import br.com.cs.didemo.services.GreetingService;
import br.com.cs.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		return new GreetingServiceFactory(repository);
	}

	@Bean
	@Primary
	@Profile({ "default", "en" })
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean
	@Primary
	@Profile("pt")
	GreetingService primaryPortugueseGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("pt");
	}

	@Bean
	@Primary
	@Profile("de")
	GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}

}
