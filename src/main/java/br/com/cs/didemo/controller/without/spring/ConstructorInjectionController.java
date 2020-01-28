package br.com.cs.didemo.controller.without.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import br.com.cs.didemo.services.GreetingService;

@Controller
public class ConstructorInjectionController {

	private GreetingService greetingService;

	// @Autowired // Says that want this field to be injected by the Spring container Optional for constructors 
	// We commented the Auto Wired in order to define a qualifier since we have more
	// than one implementation of GreetingService interface, we are choosing one here!!
	public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingServiceImp) {
		this.greetingService = greetingServiceImp;
	}

	public String sayHello() {
		return this.greetingService.sayGreeting();
	}
}
