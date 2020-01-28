package br.com.cs.didemo.controller.without.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import br.com.cs.didemo.services.GreetingService;

@Controller
public class SetterInjectionController {

	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingServiceImp(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
